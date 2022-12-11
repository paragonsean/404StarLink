# ProjectUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callback_url** | **str** | Optional. If you provide a callback URL, we will send POST callbacks when the status of the current project is changed. Possible status changes are, &#39;translated&#39;, &#39;proofread&#39;, &#39;completed&#39;. | [optional] 
**coupon_code** | **str** | Coupon code to redeem | [optional] 
**custom** | **List[str]** | Optional. This is a consistent custom data parameter that will be given to you in the response across every request of this project model. Values should be provided like this, custom[my_key] &#x3D; my_value. If you previously provided one, it will be replaced. | [optional] 
**source_language** | **str** |  | [optional] 
**target_languages** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.project_update import ProjectUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectUpdate from a JSON string
project_update_instance = ProjectUpdate.from_json(json)
# print the JSON string representation of the object
print(ProjectUpdate.to_json())

# convert the object into a dict
project_update_dict = project_update_instance.to_dict()
# create an instance of ProjectUpdate from a dict
project_update_from_dict = ProjectUpdate.from_dict(project_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


