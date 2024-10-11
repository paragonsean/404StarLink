# CodeScanningAlertRule


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | A short description of the rule used to detect the alert. | [optional] 
**full_description** | **str** | description of the rule used to detect the alert. | [optional] 
**help** | **str** | Detailed documentation for the rule as GitHub Flavored Markdown. | [optional] 
**help_uri** | **str** | A link to the documentation for the rule used to detect the alert. | [optional] 
**id** | **str** | A unique identifier for the rule used to detect the alert. | [optional] 
**name** | **str** | The name of the rule used to detect the alert. | [optional] 
**security_severity_level** | **str** | The security severity of the alert. | [optional] 
**severity** | **str** | The severity of the alert. | [optional] 
**tags** | **List[str]** | A set of tags applicable for the rule. | [optional] 

## Example

```python
from openapi_client.models.code_scanning_alert_rule import CodeScanningAlertRule

# TODO update the JSON string below
json = "{}"
# create an instance of CodeScanningAlertRule from a JSON string
code_scanning_alert_rule_instance = CodeScanningAlertRule.from_json(json)
# print the JSON string representation of the object
print(CodeScanningAlertRule.to_json())

# convert the object into a dict
code_scanning_alert_rule_dict = code_scanning_alert_rule_instance.to_dict()
# create an instance of CodeScanningAlertRule from a dict
code_scanning_alert_rule_from_dict = CodeScanningAlertRule.from_dict(code_scanning_alert_rule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


