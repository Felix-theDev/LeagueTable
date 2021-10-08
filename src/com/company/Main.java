package com.company;
/** A league table
 * @author Felix Ogbonnaya
 * @since 2018-11-22
 */
public class Main {

    public static void main(String[] args) {
        Arsenal arsenal = new Arsenal("Arsenal");
        ManUtd united = new ManUtd("ManUtd");
        MyTeam  teams = new MyTeam();
        teams.addTeam(arsenal);
        arsenal.result(united, 3, 1);
        arsenal.result(united, 4, 1);

    }
}
