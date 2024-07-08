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
