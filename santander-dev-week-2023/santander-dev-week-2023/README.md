classDiagram
    class User {
        - String name
        - Account account
        - Feature[] features
        - Card card
        - News[] news
    }

    class Account {
        - String number
        - float agency
        - float balance
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String number
        - float limit
    }

    class News {
        - String icon
        - String description
    }

    User --> "1" Account : has
    User --> "0..*" Feature : has
    User --> "1" Card : has
    User --> "0..*" News : has
