# CreateUpdateProfileRequests


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document** | **str** | Client document. | [optional] 
**document_type** | **str** | Client document type. | [optional] 
**email** | **str** | Client email address. | [optional] 
**first_name** | **str** | Client first name. | [optional] 
**is_corporate** | **bool** | Indicates whether client is corporate. | [optional] 
**is_newsletter_opt_in** | **bool** | Indicates whether client otped to receive the store newsletter. | [optional] 
**last_name** | **str** | Client last name. | [optional] 
**locale_default** | **str** | Default locale, used to set store language and currency, for example. | [optional] 
**phone** | **str** | Client telephone number. | [optional] 

## Example

```python
from openapi_client.models.create_update_profile_requests import CreateUpdateProfileRequests

# TODO update the JSON string below
json = "{}"
# create an instance of CreateUpdateProfileRequests from a JSON string
create_update_profile_requests_instance = CreateUpdateProfileRequests.from_json(json)
# print the JSON string representation of the object
print(CreateUpdateProfileRequests.to_json())

# convert the object into a dict
create_update_profile_requests_dict = create_update_profile_requests_instance.to_dict()
# create an instance of CreateUpdateProfileRequests from a dict
create_update_profile_requests_from_dict = CreateUpdateProfileRequests.from_dict(create_update_profile_requests_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


