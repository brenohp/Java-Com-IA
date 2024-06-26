
# MÓDULO - Versionamento de código com Git e GitHub

Repositório para armazenar resumos sobre Git e Github do curso de versionamento de código com Git e GitHub [Digital Innovation One](https://www.dio.me/)

## 📚 Documentação
- [Documentação Git](https://git-scm.com/docs/git/pt_BR)
- [Documentação GitGub](https://docs.github.com/pt)

## 🖥️ Resumo das aulas

### Comandos do git

| Comandos | Descrição |
|-------|---------|
| git init | Para iniciar o git no diretório local atual |
| git add README.md | Adicionar um readme.md para seu repositório |
| git clone | Para clonar repositório |
| git clone --branch feature-1 --single-branch | Clonar apenas uma branch |
| git remote add origin "URL" | Conectar remotamente em um repositório |
| git branch -M main | [Resumo]() |
| git push -u origin main | [Resumo]() |
| git commit -m "first commit" | Criar um commit |
| git status | Mostrar status da área de preparação |
| git add . | Adicionar todos arquivos a área de preparação |
| git log | Mostrar log de commits |
| git commit --amend -m "Nova mensagem" | Alterar mensagem do ultimo commit |
| git commit --amend | Alterar mensagem pelo editor |
| git reset --soft "código do commit que deseja alterar" | Retorna os arquivos que estavam posteriormente nos commit que especificamos e coloca-los na área de prepração |
| git reset --mixed "código do commit que deseja alterar" | Coloca os arquivos do commit na arvore de trabalho |
| git reset --hard "código do commit que deseja alterar" | Apaga todos os arquivos do commit selecionado |
| git reflog | ostra o histório de alterações nos commit |
| git checkout -b "nome branch nova" | trocar da branch atual para uma nova apontando para o commit atual |
| git checkout "nome da branch" | retornar para branch citada |
| git branch -v | listar todas as branch e ultimos commit|
| git branch | listar todas as branch |
| git branch -d "nome branch" | deletar branch selecionada |
| git fetch origin main | para atualizar alterações feita no repositório remoto sem aparecer no repositório local |
| git diff main origin/main | mostra as alterações feita no repositório remoto |
| git merge main origin/main | baixar conteudo da branch remota sem mesclar com a branch local |
| git merge main origin/main | baixar conteudo da branch remota sem mesclar com a branch local |
| git clone "link repositório" --branch "branch que deseja clonar" --single-branch | clonar branch especifica no repo local|
| git stash | arquivar alteração feita |
| git stash -list | mostra as modificações que arquivamos |



## 🔎Referências
- [Digital Innovation One](https://www.dio.me/)


