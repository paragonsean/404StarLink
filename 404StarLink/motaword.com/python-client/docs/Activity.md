# Activity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activity_at** | **int** | Unix epoch time | [optional] 
**id** | **int** |  | [optional] 
**links** | [**ActivityLinks**](ActivityLinks.md) |  | [optional] 
**source_text** | **str** | Source text | [optional] 
**target_text** | **str** | Target text of the activity, which is actually the translation of the source text. | [optional] 
**translator** | **int** | Unique identifier of the translator/proofreader of this activity. | [optional] 
**type** | **str** | Currently there are two available activity types; &#39;translated&#39;, &#39;proofread&#39;. | [optional] 

## Example

```python
from openapi_client.models.activity import Activity

# TODO update the JSON string below
json = "{}"
# create an instance of Activity from a JSON string
activity_instance = Activity.from_json(json)
# print the JSON string representation of the object
print(Activity.to_json())

# convert the object into a dict
activity_dict = activity_instance.to_dict()
# create an instance of Activity from a dict
activity_from_dict = Activity.from_dict(activity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


