package com.example.menskin.SharedVariables;

public class SharedVariables {
    private static String[][] skinType = new String[5][2];
    public SharedVariables() { // 생성자
        setSkinTypeData();
    }

    private void setSkinTypeData() { // 피부 데이터 생성
        skinType[0][0] = "Oily Skin";
        skinType[0][1] = "지성 피부";
        // 지성 피부는 피지 분비가 많은 피부를 가리킵니다.
        // 빛나는 모습, 확장된 모공, 여드름 등이 특징입니다.
        // 피지 분비를 조절하기 위한 관리가 필요할 수 있습니다.

        skinType[1][0] = "Dry Skin";
        skinType[1][1] = "건성 피부";
        // 건성 피부는 피부가 수분을 충분히 유지하지 못하는 피부를 가리킵니다.
        // 각질 형성, 간지러운 피부, 건조함, 케라토시스 피부 등이 특징입니다.
        // 적절한 보습이 필요합니다.

        skinType[2][0] = "Combination Skin";
        skinType[2][1] = "복합성 피부";
        // 복합성 피부는 얼굴의 여러 부분에서 다른 피부 유형을 가지고 있는 경우를 가리킵니다.
        // 일부 부분은 지성이고, 다른 부분은 건성일 수 있습니다.
        // 각 부분에 맞는 관리가 필요합니다.

        skinType[3][0] = "Sensitive Skin";
        skinType[3][1] = "민감성 피부";
        // 민감성 피부는 다양한 화학 물질이나 환경 요소에 민감하게 반응하는 피부를 가리킵니다.
        // 가려움, 붉은 반점, 피부 염증 등이 특징입니다.
        // 올바른 피부 관리 및 제품 선택이 중요합니다.

        skinType[4][0] = "Normal Skin";
        skinType[4][1] = "중성 피부";
        // 민감성 피부는 다양한 화학 물질이나 환경 요소에 민감하게 반응하는 피부를 가리킵니다.
        // 가려움, 붉은 반점, 피부 염증 등이 특징입니다.
        // 올바른 피부 관리 및 제품 선택이 중요합니다.
    }
}
