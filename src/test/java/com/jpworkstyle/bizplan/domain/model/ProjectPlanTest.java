package com.jpworkstyle.bizplan.domain.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ProjectPlanTest {

    @Test
    @DisplayName("プロジェクト計画のコンストラクタのテスト")
    void projectPlanTest() {
        ProjectPlan projectPlan = new ProjectPlan("1st Development");
        Assertions.assertNotNull(projectPlan);
        Assertions.assertEquals("1st Development", projectPlan.name());
    }

    @Test
    @DisplayName("プロジェクト計画の名前を設定する")
    void projectPlanSetName() {
        ProjectPlan projectPlan = new ProjectPlan("Initial Plan");
        projectPlan.setName("New plan name");
        Assertions.assertEquals("New plan name", projectPlan.name());
    }
}
