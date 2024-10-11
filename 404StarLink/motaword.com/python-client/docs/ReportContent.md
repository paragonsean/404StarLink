# ReportContent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity_type** | **str** | Activity Type | [optional] 
**message** | **str** | Report Message | [optional] 

## Example

```python
from openapi_client.models.report_content import ReportContent

# TODO update the JSON string below
json = "{}"
# create an instance of ReportContent from a JSON string
report_content_instance = ReportContent.from_json(json)
# print the JSON string representation of the object
print(ReportContent.to_json())

# convert the object into a dict
report_content_dict = report_content_instance.to_dict()
# create an instance of ReportContent from a dict
report_content_from_dict = ReportContent.from_dict(report_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


