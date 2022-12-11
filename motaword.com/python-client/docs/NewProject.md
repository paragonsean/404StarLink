# NewProject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callback_url** | **str** | Optional. If you provide a callback URL, we will send POST callbacks when the status of the current project is changed. Possible status changes are, &#39;translated&#39;, &#39;proofread&#39;, &#39;completed&#39;. | [optional] 
**coupon_code** | **str** | Coupon code to redeem | [optional] 
**custom** | **List[str]** | Optional. This is a consistent custom data parameter that will be given to you in the response across every request of this project model. Values should be provided like this, custom[my_key] &#x3D; my_value. | [optional] 
**documents** | **bytearray** | Optional. You can add as many files as you want in documents[] parameter. Or you add your documents later in separate calls. | [optional] 
**glossaries** | **bytearray** | Optional. Only one glossary is supported at the moment. | [optional] 
**source_language** | **str** |  | [optional] 
**styleguides** | **bytearray** | Optional. You can add as many files as you want in styleguides[] parameter. Or you add your style guides later in separate calls. | [optional] 
**target_languages** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.new_project import NewProject

# TODO update the JSON string below
json = "{}"
# create an instance of NewProject from a JSON string
new_project_instance = NewProject.from_json(json)
# print the JSON string representation of the object
print(NewProject.to_json())

# convert the object into a dict
new_project_dict = new_project_instance.to_dict()
# create an instance of NewProject from a dict
new_project_from_dict = NewProject.from_dict(new_project_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


