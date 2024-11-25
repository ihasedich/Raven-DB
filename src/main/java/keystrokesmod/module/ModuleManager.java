package keystrokesmod.module;

import keystrokesmod.module.impl.client.*;
import keystrokesmod.module.impl.combat.*;
import keystrokesmod.module.impl.exploit.*;
import keystrokesmod.module.impl.minigames.*;
import keystrokesmod.module.impl.movement.*;
import keystrokesmod.module.impl.other.*;
import keystrokesmod.module.impl.player.*;
import keystrokesmod.module.impl.render.*;
import keystrokesmod.module.impl.world.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ModuleManager {
    static List<Module> modules = new ArrayList<>();
    public static List<Module> organizedModules = new ArrayList<>();

    public static Module longJump;
    public static Blink blink;
    public static Module nameHider;
    public static Module fastPlace;
    public static MurderMystery murderMystery;
    public static AntiFireball antiFireball;
    public static BedAura bedAura;
    public static FastMine fastMine;
    public static Module antiShuffle;
    public static Module commandLine;
    public static Module antiBot;
    public static NoSlow noSlow;
    public static KillAura killAura;
    public static AutoClicker autoClicker;
    public static BedESP bedESP;
    public static HUD hud;
    public static Timer timer;
    public static Fly fly;
    public static Potions potions;
    public static NoFall noFall;
    public static PlayerESP playerESP;
    public static SafeWalk safeWalk;
    public static KeepSprint keepSprint;
    public static Velocity velocity;
    public static Tower tower;
    public static BedWars bedwars;
    public static Speed speed;
    public static InvManager invManager;
    public static Scaffold scaffold;
    public static AntiVoid antiVoid;
    public static TargetStrafe targetStrafe;
    public static HitSelect hitSelect;
    public static NoHurtCam noHurtCam;
    public static NoCameraClip noCameraClip;
    public static AutoPlay autoPlay;
    public static CustomName customName;
    public static CommandChat commandChat;
    public static NoBackground noBackground;
    public static Backtrack backtrack;
    public static Particles particles;
    public static RecordClick recordClick;
    public static ClickRecorder clickRecorder;
    public static FreeLook freeLook;
    public static Step step;
    public static Animations animations;
    public static ChestStealer chestStealer;
    public static Sprint sprint;
    public static RotationHandler rotationHandler;
    public static CustomCape customCape;
    public static ClientSpoofer clientSpoofer;
    public static BlockHit blockHit;
    public static FullBright fullBright;
    public static ModSpoofer modSpoofer;
    public static SlotHandler slotHandler;
    public static Ambience ambience;
    public static DynamicManager dynamicManager;
    public static Disabler disabler;
    public static Watermark watermark;
    public static Notifications notifications;
    public static ViewPackets viewPackets;
    public static AirStuck airStuck;
    public static TargetHUD targetHUD;
    public static TargetESP targetESP;
    public static Language language;
    public static ClientTheme clientTheme;
    public static AutoChest autoChest;
    public static ViaVersionFix viaVersionFix;
    public static AutoGapple autoGapple;
    public static ChatAI chatAI;

    public void register() {

        // client
        this.addModule(commandChat = new CommandChat());
        this.addModule(commandLine = new CommandLine());
        this.addModule(dynamicManager = new DynamicManager());
        this.addModule(new Gui());
        // this.addModule(new NyaProxy());
        this.addModule(new Settings());
        this.addModule(new MiddleClick());
        this.addModule(notifications = new Notifications());
        this.addModule(language = new Language());

        // combat
        this.addModule(new AimAssist());
        this.addModule(autoClicker = new AutoClicker());
        this.addModule(blockHit = new BlockHit());
        this.addModule(hitSelect = new HitSelect());
        this.addModule(killAura = new KillAura());
        this.addModule(velocity = new Velocity());
        this.addModule(airStuck = new AirStuck());
        this.addModule(autoGapple = new AutoGapple());

        // minigames
        this.addModule(bedwars = new BedWars());
        this.addModule(new BridgeInfo());
        this.addModule(new DuelsStats());
        this.addModule(murderMystery = new MurderMystery());

        // movement
        this.addModule(fly = new Fly());
        this.addModule(new InvMove());
        this.addModule(keepSprint = new KeepSprint());
        this.addModule(longJump = new LongJump());
        this.addModule(noSlow = new NoSlow());
        this.addModule(speed = new Speed());
        this.addModule(sprint = new Sprint());
        this.addModule(step = new Step());
        this.addModule(targetStrafe = new TargetStrafe());
        this.addModule(timer = new Timer());

        // other
        this.addModule(new Anticheat());
        this.addModule(autoPlay = new AutoPlay());
        this.addModule(clickRecorder = new ClickRecorder());
        this.addModule(new FakeChat());
        this.addModule(new LatencyAlerts());
        this.addModule(nameHider = new NameHider());
        this.addModule(recordClick = new RecordClick());
        this.addModule(rotationHandler = new RotationHandler());
        this.addModule(new ScreenshotHelper());
        this.addModule(slotHandler = new SlotHandler());
        this.addModule(new BedProximityAlert());
        this.addModule(viewPackets = new ViewPackets());
        this.addModule(chatAI = new ChatAI());

        // player
        this.addModule(antiFireball = new AntiFireball());
        this.addModule(antiVoid = new AntiVoid());
        this.addModule(new AutoSwap());
        this.addModule(backtrack = new Backtrack());
        this.addModule(blink = new Blink());
        this.addModule(chestStealer = new ChestStealer());
        this.addModule(new DelayRemover());
        this.addModule(new Freecam());
        this.addModule(invManager = new InvManager());
        this.addModule(noFall = new NoFall());
        this.addModule(new NoRotate());
        this.addModule(autoChest = new AutoChest());

        // render
        this.addModule(ambience = new Ambience());
        this.addModule(animations = new Animations());
        this.addModule(antiShuffle = new AntiShuffle());
        this.addModule(bedESP = new BedESP());
        this.addModule(new BreakProgress());
        this.addModule(new Chams());
        this.addModule(new ChestESP());
        this.addModule(customCape = new CustomCape());
        this.addModule(customName = new CustomName());
        this.addModule(freeLook = new FreeLook());
        this.addModule(fullBright = new FullBright());
        this.addModule(hud = new HUD());
        this.addModule(new Indicators());
        this.addModule(new ItemESP());
        this.addModule(new MobESP());
        this.addModule(new Nametags());
        this.addModule(noBackground = new NoBackground());
        this.addModule(noCameraClip = new NoCameraClip());
        this.addModule(noHurtCam = new NoHurtCam());
        this.addModule(particles = new Particles());
        this.addModule(playerESP = new PlayerESP());
        this.addModule(potions = new Potions());
        this.addModule(new Shaders());
        this.addModule(targetHUD = new TargetHUD());
        this.addModule(targetESP = new TargetESP());
        this.addModule(new Trajectories());
        this.addModule(new BedPlates());
        this.addModule(watermark = new Watermark());
        this.addModule(new Explosions());
        this.addModule(clientTheme = new ClientTheme());

        // world
        this.addModule(antiBot = new AntiBot());
        this.addModule(new AutoPlace());
        this.addModule(new AutoTool());
        this.addModule(bedAura = new BedAura());
        this.addModule(fastMine = new FastMine());
        this.addModule(fastPlace = new FastPlace());
        this.addModule(safeWalk = new SafeWalk());
        this.addModule(scaffold = new Scaffold());
        this.addModule(tower = new Tower());

        // exploit
        this.addModule(clientSpoofer = new ClientSpoofer());
        this.addModule(disabler = new Disabler());
        this.addModule(modSpoofer = new ModSpoofer());
        this.addModule(viaVersionFix = new ViaVersionFix());

        // enable
        antiBot.enable();
        commandChat.enable();
        notifications.enable();
        clientTheme.enable();
        modules.sort(Comparator.comparing(Module::getPrettyName));
    }

    public void addModule(Module m) {
        modules.add(m);
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Module> inCategory(Module.category category) {
        ArrayList<Module> categoryML = new ArrayList<>();

        for (Module mod : this.getModules()) {
            if (mod.moduleCategory().equals(category)) {
                categoryML.add(mod);
            }
        }

        return categoryML;
    }

    public Module getModule(String moduleName) {
        for (Module module : modules) {
            if (module.getName().equals(moduleName)) {
                return module;
            }
        }
        return null;
    }

    private static double getWidth(@NotNull Module module) {
        String text = module.getPrettyName()
                + ((HUD.showInfo.isToggled() && !module.getPrettyInfo().isEmpty()) ? " " + module.getPrettyInfo() : "");
        return HUD.getFontRenderer().width(HUD.lowercase.isToggled() ? text.toLowerCase() : text);
    }

    public static void sort() {
        if (HUD.alphabeticalSort.isToggled()) {
            organizedModules.sort(Comparator.comparing(Module::getPrettyName));
        } else {
            organizedModules.sort((c1, c2) -> Double.compare(getWidth(c2), getWidth(c1)));
        }
    }
}