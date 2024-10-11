# CreateAppRequestCreateApplicationRequest

Specifies the display name of an application and the tags to associate with the application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.create_app_request_create_application_request import CreateAppRequestCreateApplicationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAppRequestCreateApplicationRequest from a JSON string
create_app_request_create_application_request_instance = CreateAppRequestCreateApplicationRequest.from_json(json)
# print the JSON string representation of the object
print(CreateAppRequestCreateApplicationRequest.to_json())

# convert the object into a dict
create_app_request_create_application_request_dict = create_app_request_create_application_request_instance.to_dict()
# create an instance of CreateAppRequestCreateApplicationRequest from a dict
create_app_request_create_application_request_from_dict = CreateAppRequestCreateApplicationRequest.from_dict(create_app_request_create_application_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


