

# UpgradeHistoryEntry

The entry of VM image upgrade history.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Action. Rolloback or Upgrade. |  [optional] |
|**containerImage** | **String** | The container image before this instance upgrade. |  [optional] |
|**createTime** | **String** | The time that this instance upgrade history entry is created. |  [optional] |
|**framework** | **String** | The framework of this notebook instance. |  [optional] |
|**snapshot** | **String** | The snapshot of the boot disk of this notebook instance before upgrade. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of this instance upgrade history entry. |  [optional] |
|**targetImage** | **String** | Target VM Image. Format: &#x60;ainotebooks-vm/project/image-name/name&#x60;. |  [optional] |
|**targetVersion** | **String** | Target VM Version, like m63. |  [optional] |
|**version** | **String** | The version of the notebook instance before this upgrade. |  [optional] |
|**vmImage** | **String** | The VM image before this instance upgrade. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ACTION_UNSPECIFIED | &quot;ACTION_UNSPECIFIED&quot; |
| UPGRADE | &quot;UPGRADE&quot; |
| ROLLBACK | &quot;ROLLBACK&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| STARTED | &quot;STARTED&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |



