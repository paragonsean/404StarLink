# CodeScanningAlertItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** | The time that the alert was created in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [readonly] 
**dismissed_at** | **datetime** | The time that the alert was dismissed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [readonly] 
**dismissed_by** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | 
**dismissed_reason** | [**CodeScanningAlertDismissedReason**](CodeScanningAlertDismissedReason.md) |  | 
**fixed_at** | **datetime** | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] [readonly] 
**html_url** | **str** | The GitHub URL of the alert resource. | [readonly] 
**instances_url** | **str** | The REST API URL for fetching the list of instances for an alert. | [readonly] 
**most_recent_instance** | [**CodeScanningAlertInstance**](CodeScanningAlertInstance.md) |  | 
**number** | **int** | The security alert number. | [readonly] 
**rule** | [**CodeScanningAlertRuleSummary**](CodeScanningAlertRuleSummary.md) |  | 
**state** | [**CodeScanningAlertState**](CodeScanningAlertState.md) |  | 
**tool** | [**CodeScanningAnalysisTool**](CodeScanningAnalysisTool.md) |  | 
**updated_at** | **datetime** | The time that the alert was last updated in ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. | [optional] [readonly] 
**url** | **str** | The REST API URL of the alert resource. | [readonly] 

## Example

```python
from openapi_client.models.code_scanning_alert_items import CodeScanningAlertItems

# TODO update the JSON string below
json = "{}"
# create an instance of CodeScanningAlertItems from a JSON string
code_scanning_alert_items_instance = CodeScanningAlertItems.from_json(json)
# print the JSON string representation of the object
print(CodeScanningAlertItems.to_json())

# convert the object into a dict
code_scanning_alert_items_dict = code_scanning_alert_items_instance.to_dict()
# create an instance of CodeScanningAlertItems from a dict
code_scanning_alert_items_from_dict = CodeScanningAlertItems.from_dict(code_scanning_alert_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


