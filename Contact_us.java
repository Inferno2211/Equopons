package appinventor.ai_hackathonpv2021.Hackathon;

import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Contact_us.yail */
public class Contact_us extends Form implements Runnable {
    public static Contact_us Contact_us;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Contact_us").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Sizing").readResolve());
    static final IntNum Lit100 = IntNum.make(-1007);
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final IntNum Lit102 = IntNum.make(16777215);
    static final FString Lit103 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("get-simple-name").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit112 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit114 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("dispatchGenericEvent").readResolve());
    static final SimpleSymbol Lit117 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final FString Lit13 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final IntNum Lit15;
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit17 = IntNum.make(-2);
    static final FString Lit18 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit19 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement2").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("AlignHorizontal").readResolve());
    static final IntNum Lit22 = IntNum.make(3);
    static final IntNum Lit23;
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit25 = IntNum.make(-1007);
    static final FString Lit26 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("Image2").readResolve());
    static final SimpleSymbol Lit29 = ((SimpleSymbol) new SimpleSymbol("Clickable").readResolve());
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final IntNum Lit30 = IntNum.make(-1006);
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final IntNum Lit32 = IntNum.make(-1010);
    static final FString Lit33 = new FString("com.google.appinventor.components.runtime.Image");
    static final PairWithPosition Lit34;
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Image2$Click").readResolve());
    static final SimpleSymbol Lit36 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("Label16").readResolve());
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit41 = IntNum.make(25);
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("HasMargins").readResolve());
    static final IntNum Lit44 = IntNum.make(-1010);
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit47 = IntNum.make(1);
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit49 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("Image3").readResolve());
    static final IntNum Lit51 = IntNum.make(-1006);
    static final IntNum Lit52 = IntNum.make(-1010);
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Label17").readResolve());
    static final IntNum Lit56;
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("Label3").readResolve());
    static final IntNum Lit6;
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final IntNum Lit66 = IntNum.make(-1010);
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit68 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit69 = ((SimpleSymbol) new SimpleSymbol("Label4").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("Label5").readResolve());
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Label8").readResolve());
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("Label6").readResolve());
    static final IntNum Lit79 = IntNum.make(20);
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("ShowListsAsJson").readResolve());
    static final FString Lit80 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit81 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Label20").readResolve());
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final IntNum Lit86 = IntNum.make(16777215);
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("Enabled").readResolve());
    static final FString Lit88 = new FString("com.google.appinventor.components.runtime.Button");
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit90 = ((SimpleSymbol) new SimpleSymbol("Label13").readResolve());
    static final FString Lit91 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit92 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("Label12").readResolve());
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit96 = ((SimpleSymbol) new SimpleSymbol("Label15").readResolve());
    static final FString Lit97 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("Label21").readResolve());
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public HorizontalArrangement HorizontalArrangement2;
    public Image Image2;
    public final ModuleMethod Image2$Click;
    public Image Image3;
    public Label Label1;
    public Label Label12;
    public Label Label13;
    public Label Label15;
    public Label Label16;
    public Label Label17;
    public Label Label2;
    public Label Label20;
    public Label Label21;
    public Label Label3;
    public Label Label4;
    public Label Label5;
    public Label Label6;
    public Label Label8;
    public VerticalArrangement VerticalArrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod onCreate;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    static {
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit56 = IntNum.make(iArr);
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit34 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1626985825293_0.8746467578274589-0/youngandroidproject/../src/appinventor/ai_hackathonpv2021/Hackathon/Contact_us.yail", 221263);
        int[] iArr2 = new int[2];
        iArr2[0] = -1;
        Lit23 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -1;
        Lit15 = IntNum.make(iArr3);
        int[] iArr4 = new int[2];
        iArr4[0] = -5513768;
        Lit6 = IntNum.make(iArr4);
    }

    public Contact_us() {
        ModuleInfo.register(this);
        frame frame2 = new frame();
        frame2.$main = this;
        this.get$Mnsimple$Mnname = new ModuleMethod(frame2, 1, Lit104, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.onCreate = new ModuleMethod(frame2, 2, "onCreate", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = new ModuleMethod(frame2, 3, Lit105, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame2, 4, Lit106, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 5, Lit107, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame2, 7, Lit108, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame2, 8, Lit109, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(frame2, 9, Lit110, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(frame2, 10, Lit111, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame2, 11, Lit112, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame2, 12, Lit113, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = new ModuleMethod(frame2, 13, Lit114, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = new ModuleMethod(frame2, 14, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.dispatchEvent = new ModuleMethod(frame2, 15, Lit115, 16388);
        this.dispatchGenericEvent = new ModuleMethod(frame2, 16, Lit116, 16388);
        this.lookup$Mnhandler = new ModuleMethod(frame2, 17, Lit117, 8194);
        ModuleMethod moduleMethod = new ModuleMethod(frame2, 18, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime7688346696957088787.scm:622");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(frame2, 19, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame2, 20, null, 0);
        lambda$Fn3 = new ModuleMethod(frame2, 21, null, 0);
        lambda$Fn4 = new ModuleMethod(frame2, 22, null, 0);
        lambda$Fn5 = new ModuleMethod(frame2, 23, null, 0);
        lambda$Fn6 = new ModuleMethod(frame2, 24, null, 0);
        lambda$Fn7 = new ModuleMethod(frame2, 25, null, 0);
        lambda$Fn8 = new ModuleMethod(frame2, 26, null, 0);
        this.Image2$Click = new ModuleMethod(frame2, 27, Lit35, 0);
        lambda$Fn9 = new ModuleMethod(frame2, 28, null, 0);
        lambda$Fn10 = new ModuleMethod(frame2, 29, null, 0);
        lambda$Fn11 = new ModuleMethod(frame2, 30, null, 0);
        lambda$Fn12 = new ModuleMethod(frame2, 31, null, 0);
        lambda$Fn13 = new ModuleMethod(frame2, 32, null, 0);
        lambda$Fn14 = new ModuleMethod(frame2, 33, null, 0);
        lambda$Fn15 = new ModuleMethod(frame2, 34, null, 0);
        lambda$Fn16 = new ModuleMethod(frame2, 35, null, 0);
        lambda$Fn17 = new ModuleMethod(frame2, 36, null, 0);
        lambda$Fn18 = new ModuleMethod(frame2, 37, null, 0);
        lambda$Fn19 = new ModuleMethod(frame2, 38, null, 0);
        lambda$Fn20 = new ModuleMethod(frame2, 39, null, 0);
        lambda$Fn21 = new ModuleMethod(frame2, 40, null, 0);
        lambda$Fn22 = new ModuleMethod(frame2, 41, null, 0);
        lambda$Fn23 = new ModuleMethod(frame2, 42, null, 0);
        lambda$Fn24 = new ModuleMethod(frame2, 43, null, 0);
        lambda$Fn25 = new ModuleMethod(frame2, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(frame2, 45, null, 0);
        lambda$Fn27 = new ModuleMethod(frame2, 46, null, 0);
        lambda$Fn28 = new ModuleMethod(frame2, 47, null, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        String obj;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Contact_us = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find2).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Hackathon", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Boolean.FALSE, Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Fixed", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "Contact_us", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.FALSE, Lit9), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit13, Lit14, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit18, Lit14, lambda$Fn4);
                }
                this.HorizontalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit14, Lit19, Lit20, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit14, Lit26, Lit20, lambda$Fn6);
                }
                this.Image2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit20, Lit27, Lit28, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit20, Lit33, Lit28, lambda$Fn8);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit35, this.Image2$Click);
                } else {
                    addToFormEnvironment(Lit35, this.Image2$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Image2", "Click");
                } else {
                    addToEvents(Lit28, Lit36);
                }
                this.Label16 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit20, Lit37, Lit38, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit20, Lit48, Lit38, lambda$Fn10);
                }
                this.Image3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit20, Lit49, Lit50, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit20, Lit53, Lit50, lambda$Fn12);
                }
                this.Label17 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit14, Lit54, Lit55, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit14, Lit57, Lit55, lambda$Fn14);
                }
                this.Label3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit58, Lit59, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit60, Lit59, Boolean.FALSE);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit61, Lit62, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit63, Lit62, Boolean.FALSE);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit64, Lit65, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit67, Lit65, lambda$Fn16);
                }
                this.Label4 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit68, Lit69, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit70, Lit69, Boolean.FALSE);
                }
                this.Label5 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit71, Lit72, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit73, Lit72, Boolean.FALSE);
                }
                this.Label8 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit74, Lit75, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit76, Lit75, Boolean.FALSE);
                }
                this.Label6 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit77, Lit78, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit0, Lit80, Lit78, lambda$Fn18);
                }
                this.Label20 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit81, Lit82, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit0, Lit83, Lit82, lambda$Fn20);
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit84, Lit85, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit0, Lit88, Lit85, lambda$Fn22);
                }
                this.Label13 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit89, Lit90, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit91, Lit90, Boolean.FALSE);
                }
                this.Label12 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit92, Lit93, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit94, Lit93, lambda$Fn24);
                }
                this.Label15 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit95, Lit96, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit97, Lit96, lambda$Fn26);
                }
                this.Label21 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit98, Lit99, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit0, Lit103, Lit99, lambda$Fn28);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find2);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "Hackathon", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Lit6, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Boolean.FALSE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Fixed", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "Contact_us", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.FALSE, Lit9);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit5, Lit15, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit16, Lit17, Lit7);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit5, Lit15, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit16, Lit17, Lit7);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit5, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit24, Lit25, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit17, Lit7);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit21, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit5, Lit23, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit24, Lit25, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit17, Lit7);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit24, Lit30, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit31, "image_2021-07-22_194813-removebg-preview.png", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit16, Lit32, Lit7);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit28, Lit29, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit24, Lit30, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit28, Lit31, "image_2021-07-22_194813-removebg-preview.png", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit28, Lit16, Lit32, Lit7);
    }

    public Object Image2$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("screen_1"), Lit34, "open another screen");
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit40, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit42, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit43, Boolean.FALSE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit24, Lit44, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit45, "EQOUPONS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit16, Lit17, Lit7);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit40, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit42, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit43, Boolean.FALSE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit24, Lit44, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit45, "EQOUPONS", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit38, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit16, Lit17, Lit7);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit24, Lit51, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit31, "image_2021-07-22_195521.png", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit16, Lit52, Lit7);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit50, Lit24, Lit51, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit50, Lit31, "image_2021-07-22_195521.png", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit50, Lit16, Lit52, Lit7);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit55, Lit5, Lit56, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit42, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit45, "Coupons To Promote Equality", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit16, Lit17, Lit7);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit55, Lit5, Lit56, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit42, Lit22, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit45, "Coupons To Promote Equality", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit55, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit55, Lit16, Lit17, Lit7);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit40, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit24, Lit66, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit45, "CONTACT US", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit16, Lit17, Lit7);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit65, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit40, Lit41, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit24, Lit66, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit45, "CONTACT US", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit65, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit16, Lit17, Lit7);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit40, Lit79, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit45, "Email", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit16, Lit17, Lit7);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit40, Lit79, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit45, "Email", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit16, Lit17, Lit7);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit40, Lit79, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit45, "enquiry@eqoupons.com", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit16, Lit17, Lit7);
    }

    static Object lambda21() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit40, Lit79, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit45, "enquiry@eqoupons.com", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit16, Lit17, Lit7);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit5, Lit86, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit87, Boolean.FALSE, Lit9);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit5, Lit86, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit87, Boolean.FALSE, Lit9);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit93, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit40, Lit79, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit45, "Phone", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit16, Lit17, Lit7);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit93, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit40, Lit79, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit45, "Phone", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit93, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit93, Lit16, Lit17, Lit7);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit96, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit40, Lit79, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit45, "011-123456", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit96, Lit16, Lit17, Lit7);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit96, Lit39, Boolean.TRUE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit40, Lit79, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit45, "011-123456", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit96, Lit46, Lit47, Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit96, Lit16, Lit17, Lit7);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit24, Lit100, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit45, "Text for Label21", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit101, Lit102, Lit7);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit99, Lit24, Lit100, Lit7);
        runtime.setAndCoerceProperty$Ex(Lit99, Lit45, "Text for Label21", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit99, Lit101, Lit102, Lit7);
    }

    /* compiled from: Contact_us.yail */
    public class frame extends ModuleBody {
        Contact_us $main;

        @Override // gnu.expr.ModuleBody
        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 2:
                    if (!(obj instanceof Contact_us)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 4:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return super.match1(moduleMethod, obj, callContext);
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    if (!(obj instanceof Contact_us)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 4:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 6:
                case 7:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
                case 8:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 17:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 10:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 15:
                    if (!(obj instanceof Contact_us)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 16:
                    if (!(obj instanceof Contact_us)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    return this.$main.getSimpleName(obj);
                case 2:
                    try {
                        this.$main.onCreate((Bundle) obj);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "onCreate", 1, obj);
                    }
                case 3:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 4:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return super.apply1(moduleMethod, obj);
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "is-bound-in-form-environment", 1, obj);
                    }
                case 12:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 13:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 14:
                    this.$main.processException(obj);
                    return Values.empty;
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            boolean z = true;
            switch (moduleMethod.selector) {
                case 10:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "dispatchEvent", 1, obj);
                    }
                case 16:
                    Contact_us contact_us = this.$main;
                    try {
                        Component component = (Component) obj;
                        try {
                            String str = (String) obj2;
                            try {
                                if (obj3 == Boolean.FALSE) {
                                    z = false;
                                }
                                try {
                                    contact_us.dispatchGenericEvent(component, str, z, (Object[]) obj4);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    throw new WrongType(e5, "dispatchGenericEvent", 4, obj4);
                                }
                            } catch (ClassCastException e6) {
                                throw new WrongType(e6, "dispatchGenericEvent", 3, obj3);
                            }
                        } catch (ClassCastException e7) {
                            throw new WrongType(e7, "dispatchGenericEvent", 2, obj2);
                        }
                    } catch (ClassCastException e8) {
                        throw new WrongType(e8, "dispatchGenericEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 4:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                case 7:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                default:
                    return super.apply2(moduleMethod, obj, obj2);
                case 8:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        throw new WrongType(e3, "add-to-global-var-environment", 1, obj);
                    }
                case 9:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 11:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 17:
                    return this.$main.lookupHandler(obj, obj2);
            }
        }

        @Override // gnu.expr.ModuleBody
        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 18:
                    return Contact_us.lambda2();
                case 19:
                    this.$main.$define();
                    return Values.empty;
                case 20:
                    return Contact_us.lambda3();
                case 21:
                    return Contact_us.lambda4();
                case 22:
                    return Contact_us.lambda5();
                case 23:
                    return Contact_us.lambda6();
                case 24:
                    return Contact_us.lambda7();
                case 25:
                    return Contact_us.lambda8();
                case 26:
                    return Contact_us.lambda9();
                case 27:
                    return this.$main.Image2$Click();
                case 28:
                    return Contact_us.lambda10();
                case 29:
                    return Contact_us.lambda11();
                case 30:
                    return Contact_us.lambda12();
                case 31:
                    return Contact_us.lambda13();
                case 32:
                    return Contact_us.lambda14();
                case 33:
                    return Contact_us.lambda15();
                case 34:
                    return Contact_us.lambda16();
                case 35:
                    return Contact_us.lambda17();
                case 36:
                    return Contact_us.lambda18();
                case 37:
                    return Contact_us.lambda19();
                case 38:
                    return Contact_us.lambda20();
                case 39:
                    return Contact_us.lambda21();
                case 40:
                    return Contact_us.lambda22();
                case 41:
                    return Contact_us.lambda23();
                case 42:
                    return Contact_us.lambda24();
                case 43:
                    return Contact_us.lambda25();
                case 44:
                    return Contact_us.lambda26();
                case 45:
                    return Contact_us.lambda27();
                case 46:
                    return Contact_us.lambda28();
                case 47:
                    return Contact_us.lambda29();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        @Override // gnu.expr.ModuleBody
        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 42:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 43:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 44:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 45:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 46:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 47:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    @Override // com.google.appinventor.components.runtime.AppInventorCompatActivity, com.google.appinventor.components.runtime.Form
    public void onCreate(Bundle icicle) {
        AppInventorCompatActivity.setClassicModeFromYail(true);
        super.onCreate(icicle);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        int i = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (i != 0) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (i == 0) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        boolean x;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this == componentObject) {
                    x = true;
                } else {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
                return false;
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                return false;
            }
        }
    }

    @Override // com.google.appinventor.components.runtime.Form, com.google.appinventor.components.runtime.HandlesEventDispatching
    public void dispatchGenericEvent(Component componentObject, String eventName, boolean notAlreadyHandled, Object[] args) {
        Boolean bool;
        boolean x = true;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend("any$", getSimpleName(componentObject), "$", eventName)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                apply.apply2(handler, lists.cons(componentObject, lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException exception) {
                exception.printStackTrace();
                if (this != componentObject) {
                    x = false;
                }
                if (!x ? x : IsEqual.apply(eventName, "PermissionNeeded")) {
                    processException(exception);
                } else {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                }
            } catch (Throwable exception2) {
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    @Override // com.google.appinventor.components.runtime.Form
    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Contact_us = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        try {
            LList components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            Object reverse = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse != LList.Empty) {
                try {
                    Pair arg02 = (Pair) reverse;
                    misc.force(arg02.getCar());
                    reverse = arg02.getCdr();
                } catch (ClassCastException e2) {
                    throw new WrongType(e2, "arg0", -2, reverse);
                }
            }
            Object obj3 = components;
            while (obj3 != LList.Empty) {
                try {
                    Pair arg03 = (Pair) obj3;
                    Object component$Mninfo = arg03.getCar();
                    Object component$Mnname = lists.caddr.apply1(component$Mninfo);
                    lists.cadddr.apply1(component$Mninfo);
                    Object component$Mntype = lists.cadr.apply1(component$Mninfo);
                    Object apply13 = lists.car.apply1(component$Mninfo);
                    try {
                        Object component$Mnobject = Invoke.make.apply2(component$Mntype, lookupInFormEnvironment((Symbol) apply13));
                        SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                        try {
                            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
                            obj3 = arg03.getCdr();
                        } catch (ClassCastException e3) {
                            throw new WrongType(e3, "add-to-form-environment", 0, component$Mnname);
                        }
                    } catch (ClassCastException e4) {
                        throw new WrongType(e4, "lookup-in-form-environment", 0, apply13);
                    }
                } catch (ClassCastException e5) {
                    throw new WrongType(e5, "arg0", -2, obj3);
                }
            }
            Object reverse2 = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse2 != LList.Empty) {
                try {
                    Pair arg04 = (Pair) reverse2;
                    Object var$Mnval = arg04.getCar();
                    Object var = lists.car.apply1(var$Mnval);
                    try {
                        addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                        reverse2 = arg04.getCdr();
                    } catch (ClassCastException e6) {
                        throw new WrongType(e6, "add-to-global-var-environment", 0, var);
                    }
                } catch (ClassCastException e7) {
                    throw new WrongType(e7, "arg0", -2, reverse2);
                }
            }
            Object obj4 = components;
            while (obj4 != LList.Empty) {
                try {
                    Pair arg05 = (Pair) obj4;
                    Object component$Mninfo2 = arg05.getCar();
                    lists.caddr.apply1(component$Mninfo2);
                    Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                    if (init$Mnthunk != Boolean.FALSE) {
                        Scheme.applyToArgs.apply1(init$Mnthunk);
                    }
                    obj4 = arg05.getCdr();
                } catch (ClassCastException e8) {
                    throw new WrongType(e8, "arg0", -2, obj4);
                }
            }
            Object obj5 = components;
            while (obj5 != LList.Empty) {
                try {
                    Pair arg06 = (Pair) obj5;
                    Object component$Mninfo3 = arg06.getCar();
                    Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                    lists.cadddr.apply1(component$Mninfo3);
                    callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                    obj5 = arg06.getCdr();
                } catch (ClassCastException e9) {
                    throw new WrongType(e9, "arg0", -2, obj5);
                }
            }
        } catch (YailRuntimeError exception2) {
            processException(exception2);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        LList symbols = LList.makeList(argsArray, 0);
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = LList.Empty;
        LList lList = symbols;
        while (lList != LList.Empty) {
            try {
                Pair arg0 = (Pair) lList;
                Object arg02 = arg0.getCdr();
                Object car = arg0.getCar();
                try {
                    obj = Pair.make(misc.symbol$To$String((Symbol) car), obj);
                    lList = arg02;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, lList);
            }
        }
        Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj));
        try {
            return misc.string$To$Symbol((CharSequence) apply2);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, apply2);
        }
    }

    static Object lambda2() {
        return null;
    }
}
