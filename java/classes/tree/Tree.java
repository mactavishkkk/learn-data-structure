package classes.tree;

import classes.atthe.AttheBT;

public class Tree {

  private AttheBT raiz;

  public Tree() {
    this.raiz = null;
  }

  public void insere(long id, Object elemento) {
    AttheBT novoNo = new AttheBT(id, elemento, null, null);

    if (raiz == null) {
      raiz = novoNo;
    } else {
      AttheBT atual = raiz;
      AttheBT pai;

      while (true) {
        pai = atual;

        if (id < atual.getId()) {
          atual = atual.getEsquerdo();

          if (atual == null) {
            pai.setEsquerdo(novoNo);
            return;
          }
        } else {
          atual = atual.getDireito();

          if (atual == null) {
            pai.setDireito(novoNo);
            return;
          }
        }
      }
    }
  }

  private void preFixado(AttheBT atual) {
    if (atual != null) {
      System.out.println(
          "Id: " + atual.getId() + " Elemento: " + atual.getElemento());
      preFixado(atual.getEsquerdo());
      preFixado(atual.getDireito());
    }
  }

  private void posFixado(AttheBT atual) {
    if (atual != null) {
      posFixado(atual.getEsquerdo());
      posFixado(atual.getDireito());
      System.out.println(
          "Id: " + atual.getId() + " Elemento: " + atual.getElemento());
    }
  }

  private void simFixado(AttheBT atual) {
    if (atual != null) {
      simFixado(atual.getEsquerdo());
      System.out.println(
          "Id: " + atual.getId() + " Elemento: " + atual.getElemento());
      simFixado(atual.getDireito());
    }
  }

  public void imprimeElementosArvore() {
    preFixado(raiz);
  }

  private long calcAltura(AttheBT atual, long altura) {
    if (atual != null) {
      long esquerda, direita;

      esquerda = calcAltura(atual.getEsquerdo(), altura) + 1;
      direita = calcAltura(atual.getDireito(), altura) + 1;

      if (esquerda > direita) {
        return altura + esquerda;
      } else {
        return altura + direita;
      }
    }
    return altura;
  }

  public long alturaArvore() {
    long altura = 0;
    return calcAltura(raiz, altura);
  }

  public void insereABB(long id, Object elemento) {
    if (raiz == null) {
      raiz = new AttheBT(id, elemento, null, null);
    } else {
      AttheBT novoNo = new AttheBT(id, elemento, null, null);
      insere(raiz, novoNo);
    }
  }

  private void insereOrdenado(AttheBT atual, AttheBT novo) {
    if (atual.getId() == novo.getId()) {
    }

    if (novo.getId() < atual.getId()) {
      if (atual.getEsquerdo() == null) {
        atual.setEsquerdo(novo);
      } else {
        insere(atual.getEsquerdo(), novo);
      }
    }

    if (novo.getId() > atual.getId()) {
      if (atual.getDireito() == null) {
        atual.setDireito(novo);
      } else {
        insere(atual.getDireito(), novo);
      }
    }
  }

  private void inFixado(AttheBT atual) {
    if (atual != null) {
      inFixado(atual.getEsquerdo());
      System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
      inFixado(atual.getDireito());
    }
  }

  public void imprimeElementosArvoreFixado() {
    inFixado(raiz);
  }

  // public AttheBT buscaABB(long id) {
  // return busca(raiz, id);
  // }

  // private AttheBT busca(AttheBT atual, long id) {
  // if (atual == null) {
  // } else {
  // if (id == atual.getId()) {
  // return atual;
  // } else {
  // if (id < atual.getId()) {
  // return busca(atual.getEsquerdo(), id);
  // } else {
  // }
  // }
  // }
  // }

  public boolean removeABB(long id) {
    AttheBT atual = raiz;
    AttheBT pai = raiz;
    boolean filhoEsq = true;

    while (atual.getId() != id) {
      pai = atual;
      if (id < atual.getId()) {
        filhoEsq = true;
        atual = atual.getEsquerdo();
      } else {
        filhoEsq = false;
        atual = atual.getDireito();
      }

      if (atual == null) {
        return false;
      }
    }

    if (atual.getEsquerdo() == null && atual.getDireito() == null) {
      if (atual == raiz) {
        raiz = null;
      } else {
        if (filhoEsq) {
          pai.setEsquerdo(null);
        } else {
          pai.setDireito(null);
        }
      }
    } else {
      if (atual.getDireito() == null) {
        if (atual == raiz) {
          raiz = atual.getEsquerdo();
        } else {
          if (filhoEsq) {
            pai.setEsquerdo(atual.getEsquerdo());
          } else {
            pai.setDireito(atual.getEsquerdo());
          }
        }
      } else {
        if (atual.getEsquerdo() == null) {
          if (atual == raiz) {
            raiz = atual.getDireito();
          } else {
            if (filhoEsq) {
              pai.setEsquerdo(atual.getDireito());
            } else {
              pai.setDireito(atual.getDireito());
            }
          }
        } else {
          AttheBT sucessor = getSucessor(atual);
          if (atual == raiz) {
            raiz = sucessor;
          } else {
            if (filhoEsq) {
              pai.setEsquerdo(sucessor);
            } else {
              pai.setDireito(sucessor);
            }
          }
          sucessor.setEsquerdo(atual.getEsquerdo());
        }
      }
    }
    return true;
  }

  private AttheBT getSucessor(AttheBT eliminado) {
    AttheBT sucessorPai = eliminado;
    AttheBT sucessor = eliminado;
    AttheBT atual = eliminado.getDireito();

    while (atual != null) {
      sucessorPai = sucessor;
      sucessor = atual;
      atual = atual.getEsquerdo();
    }

    if (sucessor != eliminado.getDireito()) {
    }
    return sucessor;
  }

  public void insereAVL(long id, Object elemento) {
    AttheBT novoNo = new AttheBT(id, elemento, null, null);
    insere(raiz, novoNo);
  }

  private void insere(AttheBT atual, AttheBT novo) {
    if (atual == null) {
      this.raiz = novo;
      return;
    }

    if (novo.getId() < atual.getId()) {
      if (atual.getEsquerdo() == null) {
        atual.setEsquerdo(novo);
        novo.setPai(atual);
        avaliaBalanceamento(atual);
      } else {
        insere(atual.getEsquerdo(), novo);
      }
    } else {
      if (novo.getId() > atual.getId()) {
        if (atual.getDireito() == null) {
          atual.setDireito(novo);
          novo.setPai(atual);
          avaliaBalanceamento(atual);
        } else {
          insere(atual.getDireito(), novo);
        }
      } else {
        return;
      }
    }
  }

  private void avaliaBalanceamento(AttheBT atual) {
    calcBalanceamento(atual);
    long b = atual.getBalanceio();
    if (b == -2) {
      if (altura(atual.getEsquerdo().getEsquerdo()) >= altura(atual.getEsquerdo().getDireito())) {
        atual = rotacaoDir(atual);
      } else {
        atual = duplaRotacaoDir(atual);
      }
    } else {
      if (b == 2) {
        if (altura(atual.getDireito().getDireito()) >= altura(atual.getDireito().getEsquerdo())) {
          atual = rotacaoEsq(atual);
        } else {
          atual = duplaRotacaoEsq(atual);
        }
      }
    }

    if (atual.getPai() != null) {
      avaliaBalanceamento(atual.getPai());
    } else {
      this.raiz = atual;
    }
  }

  private void calcBalanceamento(AttheBT no) {
    no.setBalanceio(altura(no.getDireito()) - altura(no.getEsquerdo()));
  }

  private long altura(AttheBT atual) {
    if (atual == null) {
      return -1;
    }

    if ((atual.getEsquerdo() == null) && (atual.getDireito() == null)) {
      return 0;
    } else {
      if (atual.getEsquerdo() == null) {
        return 1 + altura(atual.getDireito());
      } else {
        if (atual.getDireito() == null) {
          return 1 + altura(atual.getEsquerdo());
        } else {
          return 1 + Math.max(altura(atual.getEsquerdo()), altura(atual.getDireito()));
        }
      }
    }
  }

  private AttheBT rotacaoEsq(AttheBT inicial) {
    AttheBT dir = inicial.getDireito();
    dir.setPai(inicial.getPai());
    inicial.setDireito(dir.getEsquerdo());
    if (inicial.getDireito() != null) {
      inicial.getDireito().setPai(inicial);
    }

    dir.setEsquerdo(inicial);
    inicial.setPai(dir);
    if (dir.getPai() != null) {
      if (dir.getPai().getDireito() == inicial) {
        dir.getPai().setDireito(dir);
      } else if (dir.getPai().getEsquerdo() == inicial) {
        dir.getPai().setEsquerdo(dir);
      }
    }

    calcBalanceamento(inicial);
    calcBalanceamento(dir);
    return dir;
  }

  private AttheBT rotacaoDir(AttheBT inicial) {
    AttheBT esq = inicial.getEsquerdo();
    esq.setPai(inicial.getPai());
    inicial.setEsquerdo(esq.getDireito());
    if (inicial.getEsquerdo() != null) {
      inicial.getEsquerdo().setPai(inicial);
    }
    esq.setDireito(inicial);
    inicial.setPai(esq);
    if (esq.getPai() != null) {
      if (esq.getPai().getDireito() == inicial) {
        esq.getPai().setDireito(esq);
      } else if (esq.getPai().getEsquerdo() == inicial) {
        esq.getPai().setEsquerdo(esq);
      }
    }
    calcBalanceamento(inicial);
    calcBalanceamento(esq);
    return esq;
  }

  private AttheBT duplaRotacaoDir(AttheBT inicial) {
    inicial.setEsquerdo(rotacaoEsq(inicial.getEsquerdo()));
    return rotacaoDir(inicial);
  }

  private AttheBT duplaRotacaoEsq(AttheBT inicial) {
    inicial.setDireito(rotacaoDir(inicial.getDireito()));
    return rotacaoEsq(inicial);
  }
}
