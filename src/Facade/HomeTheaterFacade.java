package Facade;

import Facade.Electronics.*;

public class HomeTheaterFacade {
        Amplifier amp;
        DvdPlayer dvd;
        Projector projector;
        TheaterLights lights;
        Screen screen;
        PopcornPopper popper;
        public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, Screen screen, TheaterLights lights, PopcornPopper popper) {
            this.amp = amp;
            this.dvd = dvd;
            this.projector = projector;
            this.screen = screen;
            this.lights = lights;
            this.popper = popper;

    }
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.setDim(2);
        screen.screenDown();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd("Samsung HomeCinema");
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.screenUp();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
