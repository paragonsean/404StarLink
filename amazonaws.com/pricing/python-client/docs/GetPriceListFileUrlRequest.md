# GetPriceListFileUrlRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price_list_arn** | **str** |  | 
**file_format** | **str** |  | 

## Example

```python
from openapi_client.models.get_price_list_file_url_request import GetPriceListFileUrlRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetPriceListFileUrlRequest from a JSON string
get_price_list_file_url_request_instance = GetPriceListFileUrlRequest.from_json(json)
# print the JSON string representation of the object
print(GetPriceListFileUrlRequest.to_json())

# convert the object into a dict
get_price_list_file_url_request_dict = get_price_list_file_url_request_instance.to_dict()
# create an instance of GetPriceListFileUrlRequest from a dict
get_price_list_file_url_request_from_dict = GetPriceListFileUrlRequest.from_dict(get_price_list_file_url_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


