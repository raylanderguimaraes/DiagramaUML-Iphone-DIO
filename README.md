
 ```mermaid
graph TD;
    Início[Início] --> Recebimento[Recebimento de requisição por e-mail]
    Recebimento --> Avaliação[Avaliação da requisição]
    Avaliação -->|Requisição de mobiliário novo?| Novo{Sim}
    Avaliação -->|Requisição de remanejamento?| Remanejamento{Não}
    Novo -->|Sim| Criar_RM[Criação do documento RM]
    Criar_RM --> Verificação_estoque[Verificação de estoque]
    Verificação_estoque -->|Item em estoque?| Estoque_Sim{Sim}
    Estoque_Sim --> Entrega_item[Entrega do item]
    Estoque_Sim -->|Não| Anotar_planilha[Anotação na planilha de demanda]
    Anotar_planilha --> Demanda_item[Demanda do item]
    Demanda_item --> Recebimento_item[Recebimento do item no estoque]
    Recebimento_item --> Entrega_item
    Remanejamento -->|Sim| Criar_AR[Criação do documento AR]
    Criar_AR --> Verificação_estoque
    Verificação_estoque --> Estoque_Sim
    Estoque_Sim --> Autorização[Autorização de remanejamento]
    Autorização --> Remanejamento_mobiliário[Remanejamento do mobiliário]
    Remanejamento -->|Não| Fim[Fim]
    Fim -->|Fim| 

```
