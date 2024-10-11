# UpdateInAppTemplateRequestInAppTemplateRequest

InApp Template Request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **List** |  | [optional] 
**custom_config** | **Dict** |  | [optional] 
**layout** | [**Layout**](Layout.md) |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_in_app_template_request_in_app_template_request import UpdateInAppTemplateRequestInAppTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateInAppTemplateRequestInAppTemplateRequest from a JSON string
update_in_app_template_request_in_app_template_request_instance = UpdateInAppTemplateRequestInAppTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateInAppTemplateRequestInAppTemplateRequest.to_json())

# convert the object into a dict
update_in_app_template_request_in_app_template_request_dict = update_in_app_template_request_in_app_template_request_instance.to_dict()
# create an instance of UpdateInAppTemplateRequestInAppTemplateRequest from a dict
update_in_app_template_request_in_app_template_request_from_dict = UpdateInAppTemplateRequestInAppTemplateRequest.from_dict(update_in_app_template_request_in_app_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


