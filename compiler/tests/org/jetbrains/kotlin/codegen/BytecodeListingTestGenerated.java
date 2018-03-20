/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/bytecodeListing")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BytecodeListingTestGenerated extends AbstractBytecodeListingTest {
    public void testAllFilesPresentInBytecodeListing() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("callableNameIntrinsic.kt")
    public void testCallableNameIntrinsic() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/callableNameIntrinsic.kt");
        doTest(fileName);
    }

    @TestMetadata("coroutineContextIntrinsic.kt")
    public void testCoroutineContextIntrinsic_1_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/coroutineContextIntrinsic.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
    }

    @TestMetadata("coroutineContextIntrinsic.kt")
    public void testCoroutineContextIntrinsic_1_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/coroutineContextIntrinsic.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
    }

    @TestMetadata("coroutineFields.kt")
    public void testCoroutineFields_1_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/coroutineFields.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
    }

    @TestMetadata("coroutineFields.kt")
    public void testCoroutineFields_1_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/coroutineFields.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
    }

    @TestMetadata("defaultImpls.kt")
    public void testDefaultImpls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/defaultImpls.kt");
        doTest(fileName);
    }

    @TestMetadata("emptyMultifileFacade.kt")
    public void testEmptyMultifileFacade() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/emptyMultifileFacade.kt");
        doTest(fileName);
    }

    @TestMetadata("immutableCollection.kt")
    public void testImmutableCollection() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/immutableCollection.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineOnly.kt")
    public void testInlineOnly() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/inlineOnly.kt");
        doTest(fileName);
    }

    @TestMetadata("InlineOnlyMultifile.kt")
    public void testInlineOnlyMultifile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/InlineOnlyMultifile.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineOnlyProperty.kt")
    public void testInlineOnlyProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/inlineOnlyProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("InlineOnlyPropertyMultifile.kt")
    public void testInlineOnlyPropertyMultifile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/InlineOnlyPropertyMultifile.kt");
        doTest(fileName);
    }

    @TestMetadata("invisibleCompanionObject.kt")
    public void testInvisibleCompanionObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/invisibleCompanionObject.kt");
        doTest(fileName);
    }

    @TestMetadata("invisibleCompanionObject_lv11.kt")
    public void testInvisibleCompanionObject_lv11() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/invisibleCompanionObject_lv11.kt");
        doTest(fileName);
    }

    @TestMetadata("invisibleCompanionObject_lv12.kt")
    public void testInvisibleCompanionObject_lv12() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/invisibleCompanionObject_lv12.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmOverloadsAndParametersAnnotations.kt")
    public void testJvmOverloadsAndParametersAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/jvmOverloadsAndParametersAnnotations.kt");
        doTest(fileName);
    }

    @TestMetadata("noCollectionStubMethodsInInterface.kt")
    public void testNoCollectionStubMethodsInInterface() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/noCollectionStubMethodsInInterface.kt");
        doTest(fileName);
    }

    @TestMetadata("noDelegationsToPrivateInterfaceMembers.kt")
    public void testNoDelegationsToPrivateInterfaceMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/noDelegationsToPrivateInterfaceMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("noReceiverInCallableReferenceClasses.kt")
    public void testNoReceiverInCallableReferenceClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/noReceiverInCallableReferenceClasses.kt");
        doTest(fileName);
    }

    @TestMetadata("noRemoveAtInReadOnly.kt")
    public void testNoRemoveAtInReadOnly() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/noRemoveAtInReadOnly.kt");
        doTest(fileName);
    }

    @TestMetadata("noToArrayInJava.kt")
    public void testNoToArrayInJava() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/noToArrayInJava.kt");
        doTest(fileName);
    }

    @TestMetadata("oomInReturnUnit.kt")
    public void testOomInReturnUnit_1_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/oomInReturnUnit.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
    }

    @TestMetadata("oomInReturnUnit.kt")
    public void testOomInReturnUnit_1_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/oomInReturnUnit.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
    }

    @TestMetadata("samAdapterAndInlinedOne.kt")
    public void testSamAdapterAndInlinedOne() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/samAdapterAndInlinedOne.kt");
        doTest(fileName);
    }

    @TestMetadata("suspendReifiedFun.kt")
    public void testSuspendReifiedFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/suspendReifiedFun.kt");
        doTest(fileName);
    }

    @TestMetadata("tailCallIntrinsics.kt")
    public void testTailCallIntrinsics_1_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailCallIntrinsics.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines.experimental");
    }

    @TestMetadata("tailCallIntrinsics.kt")
    public void testTailCallIntrinsics_1_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailCallIntrinsics.kt");
        doTestWithCoroutinesPackageReplacement(fileName, "kotlin.coroutines");
    }

    @TestMetadata("tailSuspendUnitFun.kt")
    public void testTailSuspendUnitFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tailSuspendUnitFun.kt");
        doTest(fileName);
    }

    @TestMetadata("tryCatchTailCall.kt")
    public void testTryCatchTailCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/tryCatchTailCall.kt");
        doTest(fileName);
    }

    @TestMetadata("unreachable.kt")
    public void testUnreachable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/unreachable.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/annotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotations extends AbstractBytecodeListingTest {
        public void testAllFilesPresentInAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/annotations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultTargets.kt")
        public void testDefaultTargets() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/defaultTargets.kt");
            doTest(fileName);
        }

        @TestMetadata("deprecatedJvmOverloads.kt")
        public void testDeprecatedJvmOverloads() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/deprecatedJvmOverloads.kt");
            doTest(fileName);
        }

        @TestMetadata("JvmSynthetic.kt")
        public void testJvmSynthetic() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/JvmSynthetic.kt");
            doTest(fileName);
        }

        @TestMetadata("kt9320.kt")
        public void testKt9320() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/kt9320.kt");
            doTest(fileName);
        }

        @TestMetadata("literals.kt")
        public void testLiterals() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/literals.kt");
            doTest(fileName);
        }

        @TestMetadata("onProperties.kt")
        public void testOnProperties() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/onProperties.kt");
            doTest(fileName);
        }

        @TestMetadata("onReceiver.kt")
        public void testOnReceiver() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/annotations/onReceiver.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/collectionStubs")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CollectionStubs extends AbstractBytecodeListingTest {
        public void testAllFilesPresentInCollectionStubs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/collectionStubs"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noStubsInJavaSuperClass.kt")
        public void testNoStubsInJavaSuperClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/collectionStubs/noStubsInJavaSuperClass.kt");
            doTest(fileName);
        }

        @TestMetadata("stubsFromSuperclass.kt")
        public void testStubsFromSuperclass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/collectionStubs/stubsFromSuperclass.kt");
            doTest(fileName);
        }

        @TestMetadata("stubsFromSuperclassNoBridges.kt")
        public void testStubsFromSuperclassNoBridges() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/collectionStubs/stubsFromSuperclassNoBridges.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/inlineClasses")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InlineClasses extends AbstractBytecodeListingTest {
        public void testAllFilesPresentInInlineClasses() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/inlineClasses"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("companionObjectInsideInlineClass.kt")
        public void testCompanionObjectInsideInlineClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/inlineClasses/companionObjectInsideInlineClass.kt");
            doTest(fileName);
        }

        @TestMetadata("computablePropertiesInsideInlineClass.kt")
        public void testComputablePropertiesInsideInlineClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/inlineClasses/computablePropertiesInsideInlineClass.kt");
            doTest(fileName);
        }

        @TestMetadata("noBridgesForErasedInlineClass.kt")
        public void testNoBridgesForErasedInlineClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/inlineClasses/noBridgesForErasedInlineClass.kt");
            doTest(fileName);
        }

        @TestMetadata("shapeOfInlineClassWithPrimitive.kt")
        public void testShapeOfInlineClassWithPrimitive() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/inlineClasses/shapeOfInlineClassWithPrimitive.kt");
            doTest(fileName);
        }

        @TestMetadata("shapeOfInlineClassWithPrivateConstructor.kt")
        public void testShapeOfInlineClassWithPrivateConstructor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/inlineClasses/shapeOfInlineClassWithPrivateConstructor.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/bytecodeListing/specialBridges")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SpecialBridges extends AbstractBytecodeListingTest {
        public void testAllFilesPresentInSpecialBridges() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/specialBridges"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("contains.kt")
        public void testContains() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/contains.kt");
            doTest(fileName);
        }

        @TestMetadata("noSpecialBridgeIfPresentInSuperClass.kt")
        public void testNoSpecialBridgeIfPresentInSuperClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/noSpecialBridgeIfPresentInSuperClass.kt");
            doTest(fileName);
        }

        @TestMetadata("redundantStubForSize.kt")
        public void testRedundantStubForSize() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/redundantStubForSize.kt");
            doTest(fileName);
        }

        @TestMetadata("removeAtTwoSpecialBridges.kt")
        public void testRemoveAtTwoSpecialBridges() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/removeAtTwoSpecialBridges.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/signatures")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Signatures extends AbstractBytecodeListingTest {
            public void testAllFilesPresentInSignatures() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/bytecodeListing/specialBridges/signatures"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("genericClass.kt")
            public void testGenericClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/signatures/genericClass.kt");
                doTest(fileName);
            }

            @TestMetadata("nonGenericClass.kt")
            public void testNonGenericClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/signatures/nonGenericClass.kt");
                doTest(fileName);
            }

            @TestMetadata("partiallySpecializedClass.kt")
            public void testPartiallySpecializedClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/bytecodeListing/specialBridges/signatures/partiallySpecializedClass.kt");
                doTest(fileName);
            }
        }
    }
}
