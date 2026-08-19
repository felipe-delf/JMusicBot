# JMusicBot

Bot de música para Discord desenvolvido em Java, com foco em reprodução de músicas, gerenciamento de filas e integração com serviços de música.

O projeto está sendo desenvolvido de forma incremental, utilizando práticas de desenvolvimento de software, testes automatizados, CI/CD, Docker e arquitetura modular.

---

## Status

🚧 Em desenvolvimento

O projeto está atualmente na fase de configuração da base da aplicação.

---

## Objetivo

O JMusicBot terá como objetivo permitir que usuários de um servidor Discord possam:

- Pesquisar músicas pelo nome;
- Pesquisar músicas no YouTube;
- Exibir os 10 primeiros resultados de uma pesquisa;
- Selecionar uma música entre os resultados;
- Reproduzir músicas;
- Adicionar músicas à fila;
- Adicionar múltiplas músicas através de uma lista;
- Reproduzir playlists do YouTube;
- Utilizar playlists do Spotify;
- Controlar a reprodução através de comandos do Discord;
- Visualizar e gerenciar a fila de reprodução.

---

## Funcionalidades

### Pesquisa

- [ ] Pesquisa de músicas por nome;
- [ ] Integração com pesquisa do YouTube;
- [ ] Exibição dos 10 primeiros resultados;
- [ ] Seleção de um resultado entre 1 e 10;
- [ ] Tratamento de pesquisas sem resultados.

### Reprodução

- [ ] Reproduzir música;
- [ ] Pausar;
- [ ] Retomar;
- [ ] Pular música;
- [ ] Parar reprodução;
- [ ] Controle de volume;
- [ ] Repetição de música;
- [ ] Reprodução automática da próxima música.

### Fila

- [ ] Adicionar música à fila;
- [ ] Adicionar múltiplas músicas;
- [ ] Visualizar fila;
- [ ] Remover música da fila;
- [ ] Limpar fila;
- [ ] Reordenar fila;
- [ ] Exibir música atual.

### YouTube

- [ ] Pesquisa por nome;
- [ ] Reprodução através de URL;
- [ ] Suporte a playlists;
- [ ] Tratamento de URLs inválidas.

### Spotify

- [ ] Suporte a links de músicas;
- [ ] Suporte a playlists;
- [ ] Leitura das informações das músicas;
- [ ] Conversão das músicas do Spotify para fontes reproduzíveis.

> O Spotify será utilizado para identificação das músicas e playlists. A estratégia de reprodução será definida durante a implementação da integração.

### Discord

- [ ] Conexão com servidor Discord;
- [ ] Comandos de música;
- [ ] Validação de usuário em canal de voz;
- [ ] Mensagens de erro;
- [ ] Feedback das ações realizadas;
- [ ] Controle de permissões.

---

## Tecnologias

### Implementadas

- Java 21
- Spring Boot
- Spring Boot Actuator
- Maven
- JUnit 5
- Spring Boot Test
- Docker
- Docker Compose
- Git / GitHub

### Planejadas

- JDA — integração com Discord
- Lavalink — processamento/reprodução de áudio
- YouTube API / integração de pesquisa
- Spotify Web API
- PostgreSQL
- GitHub Actions
- Azure

---

## Como executar

### Pré-requisitos

Para executar o projeto localmente, é necessário ter instalado:

- Java 21
- Docker
- Docker Compose

O projeto possui o Maven Wrapper, portanto não é necessário instalar o Maven separadamente.

---

## Executando com Maven

Para executar a aplicação localmente:

### Windows

```powershell
.\mvnw spring-boot:run