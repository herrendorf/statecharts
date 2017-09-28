/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "TriggerGuardExpressions.h"

#include "sc_timer_service.h"



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;

static TriggerGuardExpressions statechart;

class TriggerGuardExpressionsTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		triggerGuardExpressions_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &triggerGuardExpressions_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(TriggerGuardExpressionsTest, trueGuard) {
	triggerGuardExpressions_enter(&statechart);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_A));
	triggerGuardExpressionsIface_raise_e1(&statechart);
	triggerGuardExpressionsIface_set_b(&statechart,true);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_B));
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_A));
	triggerGuardExpressionsIface_raise_e2(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_B));
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_A));
	triggerGuardExpressionsIface_raise_e1(&statechart);
	triggerGuardExpressionsIface_raise_e2(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_B));
}
TEST_F(TriggerGuardExpressionsTest, falseGuard) {
	triggerGuardExpressions_enter(&statechart);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_A));
	triggerGuardExpressionsIface_set_b(&statechart,false);
	triggerGuardExpressionsIface_raise_e1(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_A));
	triggerGuardExpressionsIface_raise_e2(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_A));
	triggerGuardExpressionsIface_raise_e1(&statechart);
	triggerGuardExpressionsIface_raise_e2(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(triggerGuardExpressions_isStateActive(&statechart, TriggerGuardExpressions_main_region_A));
}


