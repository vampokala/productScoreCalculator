# productScoreCalculator
This repo is for calculating the product score
## Usage

This repo is for calculating the product score

### UML Diagram
![alt text](project.jpg)

### Assumptions
## Dataset
Sample dataset with Smartphones are created. Additional datasets can be added to the Smartphones.csv file. 

### Rules
Rules are formuated with all of the parameters of the product attributes and values have been assigned to calculate the product score.

### Product Class
The product class containts the following properties

- `name`: Name of the product
- `type`: Type of the product such as smartphone, tablet
- `color`: Color of the product
- `cost`: cost of the product
- `weight`: Weight of the product
- `memory`: Hardware Memory of the product
- `brand`: The brand of the product.

### Threshold
As per the recommendations, the threshold has been set as 50

To calculate the product score, follow these steps:

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/productScoreCalculator.git
    ```

2. Navigate to the project directory:

    ```bash
    cd productScoreCalculator
    ```

3. build docker image
    ```bash
    docker-compose build
    ```
4. Execute the application from docker image
    ```bash
    docker-compose up
    ```
The ouptut from the execution shown below
 ```bash
    app-1  | Total: 32821.0
    app-1  | Average: 1131.7586206896551
    app-1  | Product Name: iPhone 11 Score: 300
    app-1  | Product Name: iPhone 12 Pro Max Score: 425
    app-1  | Product Name: Galaxy S20 FE Score: 175
    app-1  | Product Name: Galaxy S21 Ultra Score: 450
    app-1  | Product Name: iPhone 14 Pro Max Score: 475
    app-1  | Product Name: Galaxy S23 Score: 400
    app-1  | Product Name: iPhone 15 Pro Max Score: 350
    app-1  | Product Name: iPhone 11 Score: 300
    app-1  | Product Name: iPhone 12 Pro Max Score: 425
    app-1  | Product Name: Galaxy S20 FE Score: 175
    app-1  | Product Name: Galaxy S21 Ultra Score: 450
    app-1  | Product Name: iPhone 14 Pro Max Score: 475
    app-1  | Product Name: Galaxy S23 Score: 400
    app-1  | Product Name: iPhone 15 Pro Max Score: 350
    app-1  | Product Name: iPhone 13 Score: 300
    app-1  | Product Name: Galaxy S22 Score: 325
    app-1  | Product Name: iPhone SE (2021) Score: 200
    app-1  | Product Name: Galaxy Note 21 Score: 525
    app-1  | Product Name: iPhone 14 Score: 250
    app-1  | Product Name: Galaxy Z Flip 3 Score: 550
    app-1  | Product Name: iPhone 16 Pro Score: 350
    app-1  | Product Name: Galaxy A32 Score: 250
    app-1  | Product Name: iPhone 17 Score: 100
    app-1  | Product Name: Galaxy S24 Score: 425
    app-1  | Product Name: iPhone 15 Pro Max Score: 100
    app-1  | Product Name: Galaxy Fold 4 Score: 175
    app-1  | Product Name: iPhone 19 Score: 100
    app-1  | Product Name: Galaxy S25 Score: 450
    app-1  | Product Name: iPhone 15 Pro Score: 100
```
#### Future improvements
Currently the rules are written in the RuleEvaluator.java file. This can be exernalized in the future.
Using drools by creating the decision tables, by externalizing the products and rules, the application can calculate score for any type of product.
references: 
https://www.drools.org/