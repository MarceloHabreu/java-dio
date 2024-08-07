# Projeto iPhone 2007

Este projeto implementa as funcionalidades principais do iPhone original de 2007, incluindo um reprodutor musical, um aparelho telefônico e um navegador na internet. O objetivo é modelar essas funcionalidades usando UML e implementar as classes e interfaces correspondentes em Java.

## Funcionalidades

### Reprodutor Musical
- `tocar()`: Inicia a reprodução de música.
- `pausar()`: Pausa a reprodução de música.
- `selecionarMusica(String musica)`: Seleciona uma música específica.

### Aparelho Telefônico
- `ligar(String numero)`: Realiza uma chamada para o número especificado.
- `atender()`: Atende uma chamada recebida.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet
- `exibirPagina(String url)`: Exibe uma página da web especificada pela URL.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual.

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorNaInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    ReprodutorMusical <|-- iPhone
    AparelhoTelefonico <|-- iPhone
    NavegadorNaInternet <|-- iPhone
