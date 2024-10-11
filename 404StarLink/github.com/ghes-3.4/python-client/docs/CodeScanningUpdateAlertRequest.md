# CodeScanningUpdateAlertRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dismissed_reason** | [**CodeScanningAlertDismissedReason**](CodeScanningAlertDismissedReason.md) |  | [optional] 
**state** | [**CodeScanningAlertSetState**](CodeScanningAlertSetState.md) |  | 

## Example

```python
from openapi_client.models.code_scanning_update_alert_request import CodeScanningUpdateAlertRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CodeScanningUpdateAlertRequest from a JSON string
code_scanning_update_alert_request_instance = CodeScanningUpdateAlertRequest.from_json(json)
# print the JSON string representation of the object
print(CodeScanningUpdateAlertRequest.to_json())

# convert the object into a dict
code_scanning_update_alert_request_dict = code_scanning_update_alert_request_instance.to_dict()
# create an instance of CodeScanningUpdateAlertRequest from a dict
code_scanning_update_alert_request_from_dict = CodeScanningUpdateAlertRequest.from_dict(code_scanning_update_alert_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


