# CodeScanningAlertLocation

Describe a region within a file for the alert.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_column** | **int** |  | [optional] 
**end_line** | **int** |  | [optional] 
**path** | **str** |  | [optional] 
**start_column** | **int** |  | [optional] 
**start_line** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.code_scanning_alert_location import CodeScanningAlertLocation

# TODO update the JSON string below
json = "{}"
# create an instance of CodeScanningAlertLocation from a JSON string
code_scanning_alert_location_instance = CodeScanningAlertLocation.from_json(json)
# print the JSON string representation of the object
print(CodeScanningAlertLocation.to_json())

# convert the object into a dict
code_scanning_alert_location_dict = code_scanning_alert_location_instance.to_dict()
# create an instance of CodeScanningAlertLocation from a dict
code_scanning_alert_location_from_dict = CodeScanningAlertLocation.from_dict(code_scanning_alert_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


