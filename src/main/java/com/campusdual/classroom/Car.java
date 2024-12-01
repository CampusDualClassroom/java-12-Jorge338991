package com.campusdual.classroom;

public class Car {

    public static final int MAX_SPEED = 120;

    public String brand;
    public String model;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    /*METODOS*/
    /*CONSTRUCTORES*/
    public Car(){};

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }
    /*AÑADIDOS PARA COMPLETAR EXERCICIO*/

    public boolean isTachometerEqualToZero() {
        if (tachometer != 0) {
            return false;
        }
        return true;
    }

    public boolean isTachometerGreaterThanZero(){
        if (tachometer == 0) {
            return false;
        }
        return true;
    }

    /*MÉTODOS DE CLASE ORIGEN*/

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.speedometer == this.MAX_SPEED) { //comprueba si el coche ya circula a la vel máxima 120
            System.out.println("Velocidade máxima alcanzada"); //si ya circula a la vel max -> no hace nada
        } else {
            if (this.isReverse() && this.speedometer == 25) {
                System.out.println("O vehículo non pode ir a máis velocidade marcha atrás.");
            } else {
                this.speedometer += 5;
                System.out.println("A nova velocidade é " + this.speedometer);
            }
        }
    }

    public void brake() {
        if (this.speedometer == 0) {
            System.out.println("O vehículo xa está detido");
        } else {
            this.speedometer -= 5;
            System.out.println("A nova velocidade é " + this.speedometer);
        }
    }

    public void turnAngleOfWheels(int angle) {
        //0   -> posicion central
        //+90 -> máximo giro a la derecha
        //-90 -> máximo giro a la izquierda
        if (this.wheelsAngle <= 45 && this.wheelsAngle >= -45) {
            this.wheelsAngle += angle;
            if(this.wheelsAngle > 45){
                this.wheelsAngle = 45;
            } else if (this.wheelsAngle < -45) {
                this.wheelsAngle = -45;
            }

        } else {
            System.out.println("O volante non pode xirar máis. Xa está no máximo de xiro.");
        }
    }

    public String showSteeringWheelDetail() {
        StringBuilder builder = new StringBuilder();
        builder.append("O volante está ");

        if (this.wheelsAngle == 0) {
            builder.append("no centro.");
        } else if (this.wheelsAngle > 0) {
            builder.append("xirado a dereita.");
        } else {
            builder.append("xirado a esquerda.");
        }
        builder.append(" O ángulo de xiro do volante é " + this.wheelsAngle);

        return builder.toString();
    }

    private boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (this.tachometer > 0 && this.speedometer == 0) {
            /*motor acendidod e paradp*/
            if (isReverse() == reverse) {
                System.out.println("O vehículo xa ten esa marcha indicada.");
            } else {
                this.reverse = reverse;
                this.gear = "R";
            }
        } else{
            /*en movemnto ou apagado*/
        }
    }

    public void showDetails() {
        System.out.println("O coche marca " + this.brand + " modelo " + this.model + " ten unha velocidade de " + this.speedometer + " . " + "\n O tacógrafo marca " + this.tachometer + " .O sentido da marcha é " + this.gear + ". O ángulo de xiro do volante é " + this.showSteeringWheelDetail());
        StringBuilder builder = new StringBuilder();
        builder.append("O coche marca " + this.brand);
        builder.append(", modelo " + this.model);
        builder.append(". Ten unha velocidade de " + this.speedometer);
        builder.append(". O tacógrafo marca " + this.tachometer);
        builder.append(". O sentido da marcha é " + this.gear);
        builder.append(". O ángulo de xiro do volante é " + this.showSteeringWheelDetail() + ".");
        System.out.println(builder.toString());
    }
}