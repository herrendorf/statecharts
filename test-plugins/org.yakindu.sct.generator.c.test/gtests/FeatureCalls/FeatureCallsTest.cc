/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "FeatureCalls.h"

#include "sc_timer_service.h"



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;

static FeatureCalls statechart;

class FeatureCallsTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		featureCalls_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &featureCalls_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(FeatureCallsTest, FeatureCalls) {
	featureCalls_enter(&statechart);
	EXPECT_TRUE(featureCalls_isStateActive(&statechart, FeatureCalls_main_region_A));
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(featureCalls_isStateActive(&statechart, FeatureCalls_main_region_A));
}


