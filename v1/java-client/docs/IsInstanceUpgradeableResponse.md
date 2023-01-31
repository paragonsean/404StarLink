

# IsInstanceUpgradeableResponse

Response for checking if a notebook instance is upgradeable.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**upgradeImage** | **String** | The new image self link this instance will be upgraded to if calling the upgrade endpoint. This field will only be populated if field upgradeable is true. |  [optional] |
|**upgradeInfo** | **String** | Additional information about upgrade. |  [optional] |
|**upgradeVersion** | **String** | The version this instance will be upgraded to if calling the upgrade endpoint. This field will only be populated if field upgradeable is true. |  [optional] |
|**upgradeable** | **Boolean** | If an instance is upgradeable. |  [optional] |



