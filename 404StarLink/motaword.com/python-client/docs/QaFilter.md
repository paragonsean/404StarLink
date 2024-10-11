# QaFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_codes** | **List[str]** |  | [optional] 
**categories** | **List[str]** |  | [optional] 
**clients** | **List[float]** |  | [optional] 
**date_from** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**date_to** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**documents** | **List[float]** |  | [optional] 
**projects** | **List[float]** |  | [optional] 
**severities** | **List[str]** |  | [optional] 
**source_languages** | **List[str]** |  | [optional] 
**subjects** | **List[str]** |  | [optional] 
**target_languages** | **List[str]** |  | [optional] 
**vendors** | **List[float]** |  | [optional] 

## Example

```python
from openapi_client.models.qa_filter import QaFilter

# TODO update the JSON string below
json = "{}"
# create an instance of QaFilter from a JSON string
qa_filter_instance = QaFilter.from_json(json)
# print the JSON string representation of the object
print(QaFilter.to_json())

# convert the object into a dict
qa_filter_dict = qa_filter_instance.to_dict()
# create an instance of QaFilter from a dict
qa_filter_from_dict = QaFilter.from_dict(qa_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


