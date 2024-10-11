# UpdateInAppTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**in_app_template_request** | [**UpdateInAppTemplateRequestInAppTemplateRequest**](UpdateInAppTemplateRequestInAppTemplateRequest.md) |  | 

## Example

```python
from openapi_client.models.update_in_app_template_request import UpdateInAppTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateInAppTemplateRequest from a JSON string
update_in_app_template_request_instance = UpdateInAppTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateInAppTemplateRequest.to_json())

# convert the object into a dict
update_in_app_template_request_dict = update_in_app_template_request_instance.to_dict()
# create an instance of UpdateInAppTemplateRequest from a dict
update_in_app_template_request_from_dict = UpdateInAppTemplateRequest.from_dict(update_in_app_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


