package org.kd.tradeapp.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "transact")
public class Transact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int src_fund_id;
    private int dest_fund_id;
    private float units;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public float getUnits() {
        return units;
    }

    public void setUnits(float units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Transaction " + this.id + "from Fund " + getDest_fund_id() + " to party " + getSrc_fund_id();
    }

    public int getDest_fund_id() {
        return dest_fund_id;
    }

    public void setDest_fund_id(int dest_fund_id) {
        this.dest_fund_id = dest_fund_id;
    }

    public int getSrc_fund_id() {
        return src_fund_id;
    }

    public void setSrc_fund_id(int src_fund_id) {
        this.src_fund_id = src_fund_id;
    }
}
