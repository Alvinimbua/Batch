package com.imbuka.batchprocessing.config;

import com.imbuka.batchprocessing.entity.Passenger;
import lombok.NonNull;
import org.springframework.batch.item.ItemProcessor;

public class PassengerProcessor implements ItemProcessor<Passenger, Passenger> {
    @Override
    public Passenger process(@NonNull Passenger passenger) throws Exception {
        return passenger;
    }
}
