# PriceList

<p> <i> <b>This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List API is subject to the Beta Service Participation terms of the <a href=\"https://aws.amazon.com/service-terms/\">Amazon Web Services Service Terms</a> (Section 1.10).</b> </i> </p> <p>This is the type of price list references that match your request. </p>

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price_list_arn** | **str** |  | [optional] 
**region_code** | **str** |  | [optional] 
**currency_code** | **str** |  | [optional] 
**file_formats** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.price_list import PriceList

# TODO update the JSON string below
json = "{}"
# create an instance of PriceList from a JSON string
price_list_instance = PriceList.from_json(json)
# print the JSON string representation of the object
print(PriceList.to_json())

# convert the object into a dict
price_list_dict = price_list_instance.to_dict()
# create an instance of PriceList from a dict
price_list_from_dict = PriceList.from_dict(price_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


