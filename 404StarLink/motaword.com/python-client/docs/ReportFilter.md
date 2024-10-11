# ReportFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_code** | **str** | budget code filter. valid for corporate accounts only. | [optional] 
**date_from** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**date_to** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**source_languages** | **List[str]** | List of source language codes. | [optional] 
**target_languages** | **List[str]** | List of target language codes. | [optional] 
**users** | **List[int]** | List of corporate user IDs. Valid for corporate accounts only. | [optional] 

## Example

```python
from openapi_client.models.report_filter import ReportFilter

# TODO update the JSON string below
json = "{}"
# create an instance of ReportFilter from a JSON string
report_filter_instance = ReportFilter.from_json(json)
# print the JSON string representation of the object
print(ReportFilter.to_json())

# convert the object into a dict
report_filter_dict = report_filter_instance.to_dict()
# create an instance of ReportFilter from a dict
report_filter_from_dict = ReportFilter.from_dict(report_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


