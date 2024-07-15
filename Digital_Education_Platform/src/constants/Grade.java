/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package constants;

/**
 *
 * @author drag
 */
public enum Grade {
	A((float) 4.00),
	A_MINUS((float) 3.667),
	B_PLUS((float) 3.333),
	B((float) 3.000),
	B_MINUS((float) 2.667),
	C_PLUS((float) 2.333),
	C((float) 2.000),
	C_MINUS((float) 1.667),
	D_PLUS((float) 1.333),
	D((float) 1.000),
	D_MINUS((float) 0.667),
	F((float) 0.000),
	I((float) -1),
	YET_TO_COMPLETE((float) -2),
	YET_TO_GRADE((float) -3);
	
	float points;

	public float getPoints() {
		return points;
	}

	Grade(float points) {
		this.points = points;
	}

}
