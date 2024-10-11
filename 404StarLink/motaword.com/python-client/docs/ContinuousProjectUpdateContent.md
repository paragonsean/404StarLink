# ContinuousProjectUpdateContent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analytics_enabled** | **bool** |  | [optional] 
**auto_start_postedit** | **bool** |  | [optional] 
**is_enabled** | **bool** |  | [optional] 
**languages** | [**List[ContinuousProjectLanguage]**](ContinuousProjectLanguage.md) |  | [optional] 
**mt_enabled** | **bool** |  | [optional] 
**name** | **str** |  | [optional] 
**postedit_enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.continuous_project_update_content import ContinuousProjectUpdateContent

# TODO update the JSON string below
json = "{}"
# create an instance of ContinuousProjectUpdateContent from a JSON string
continuous_project_update_content_instance = ContinuousProjectUpdateContent.from_json(json)
# print the JSON string representation of the object
print(ContinuousProjectUpdateContent.to_json())

# convert the object into a dict
continuous_project_update_content_dict = continuous_project_update_content_instance.to_dict()
# create an instance of ContinuousProjectUpdateContent from a dict
continuous_project_update_content_from_dict = ContinuousProjectUpdateContent.from_dict(continuous_project_update_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


