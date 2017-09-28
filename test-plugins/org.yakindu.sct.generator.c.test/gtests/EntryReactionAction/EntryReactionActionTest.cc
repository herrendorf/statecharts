/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "EntryReactionAction.h"

#include "sc_timer_service.h"



//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;

static EntryReactionAction statechart;

class EntryReactionActionTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		entryReactionAction_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			0,
			(sc_run_cycle_fp) &entryReactionAction_runCycle,
			false,
			200,
			&statechart
		);
	}
};

void init(){
	entryReactionAction_enter(&statechart);
	entryReactionActionIface_raise_b(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	entryReactionActionIface_raise_d(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	entryReactionActionIface_set_enteredR1(&statechart,false);
	entryReactionActionIface_set_enteredR2(&statechart,false);
	entryReactionActionIface_set_enteredBdefault(&statechart,false);
	entryReactionActionIface_set_enteredBother(&statechart,false);
}

TEST_F(EntryReactionActionTest, entryTransitionActionOnStatechartEnter) {
	entryReactionAction_enter(&statechart);
	EXPECT_TRUE(entryReactionActionIface_get_enteredR1(&statechart));
	EXPECT_TRUE(entryReactionActionIface_get_enteredR2(&statechart));
	EXPECT_TRUE(entryReactionActionIface_get_enteredBdefault(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredBother(&statechart));
}
TEST_F(EntryReactionActionTest, entryOnRTS) {
	init();
	entryReactionActionIface_raise_b(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!entryReactionActionIface_get_enteredR1(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredR2(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredBdefault(&statechart));
	EXPECT_TRUE(entryReactionActionIface_get_enteredBother(&statechart));
}
TEST_F(EntryReactionActionTest, noEntryTransitionActionOnHistory) {
	init();
	entryReactionActionIface_raise_d(&statechart);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(!entryReactionActionIface_get_enteredR1(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredR2(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredBdefault(&statechart));
	EXPECT_TRUE(!entryReactionActionIface_get_enteredBother(&statechart));
}


