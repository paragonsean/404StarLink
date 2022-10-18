# InitialCookie

InitialCookie structure keep cookies that optionally can be passed to the new fetcher crawl a website that requires a login. Generate Cookies array with EditThisCookie chrome extension.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **str** |  | [optional] 
**expiration_date** | **float** |  | [optional] 
**host_only** | **bool** |  | [optional] 
**http_only** | **bool** |  | [optional] 
**id** | **float** |  | [optional] 
**name** | **str** |  | [optional] 
**path** | **str** |  | [optional] 
**same_site** | **str** |  | [optional] 
**secure** | **bool** |  | [optional] 
**session** | **bool** |  | [optional] 
**store_id** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.initial_cookie import InitialCookie

# TODO update the JSON string below
json = "{}"
# create an instance of InitialCookie from a JSON string
initial_cookie_instance = InitialCookie.from_json(json)
# print the JSON string representation of the object
print(InitialCookie.to_json())

# convert the object into a dict
initial_cookie_dict = initial_cookie_instance.to_dict()
# create an instance of InitialCookie from a dict
initial_cookie_from_dict = InitialCookie.from_dict(initial_cookie_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


