
# 📝 To-Do List - Diagrama do Banco de Dados

Abaixo está a estrutura do banco de dados representada em um diagrama UML:

```mermaid
classDiagram
    class ToDoList {
        +String name
        +List~Tasks~ tasks
        +List~Features~ features
        +TaskDetails taskDetails
        +List~News~ news
    }

    class Tasks {
        +String id
        +String category
        +String progress
        +String priority
    }

    class Features {
        +String icon
        +String description
    }

    class TaskDetails {
        +String number
        +String deadline
    }

    class News {
        +String icon
        +String description
    }

    %% Relações do Banco de Dados
    ToDoList "1" --o "N" Tasks : contém
    ToDoList "1" --o "N" Features : possui
    ToDoList "1" --o "1" TaskDetails : tem
    ToDoList "1" --o "N" News : possui
