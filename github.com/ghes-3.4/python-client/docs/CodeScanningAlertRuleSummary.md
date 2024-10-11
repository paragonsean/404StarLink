# CodeScanningAlertRuleSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | A short description of the rule used to detect the alert. | [optional] 
**id** | **str** | A unique identifier for the rule used to detect the alert. | [optional] 
**name** | **str** | The name of the rule used to detect the alert. | [optional] 
**severity** | **str** | The severity of the alert. | [optional] 
**tags** | **List[str]** | A set of tags applicable for the rule. | [optional] 

## Example

```python
from openapi_client.models.code_scanning_alert_rule_summary import CodeScanningAlertRuleSummary

# TODO update the JSON string below
json = "{}"
# create an instance of CodeScanningAlertRuleSummary from a JSON string
code_scanning_alert_rule_summary_instance = CodeScanningAlertRuleSummary.from_json(json)
# print the JSON string representation of the object
print(CodeScanningAlertRuleSummary.to_json())

# convert the object into a dict
code_scanning_alert_rule_summary_dict = code_scanning_alert_rule_summary_instance.to_dict()
# create an instance of CodeScanningAlertRuleSummary from a dict
code_scanning_alert_rule_summary_from_dict = CodeScanningAlertRuleSummary.from_dict(code_scanning_alert_rule_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


