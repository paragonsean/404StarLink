# StockData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_identifier** | **str** | The four-digit [Market Identifier Code](https://en.wikipedia.org/wiki/Market_Identifier_Code) of the stock market where the organization&#39;s stocks are traded. | [optional] 
**stock_number** | **str** | The 12-digit International Securities Identification Number (ISIN) of the company, without dashes (-). | [optional] 
**ticker_symbol** | **str** | The stock ticker symbol. | [optional] 

## Example

```python
from openapi_client.models.stock_data import StockData

# TODO update the JSON string below
json = "{}"
# create an instance of StockData from a JSON string
stock_data_instance = StockData.from_json(json)
# print the JSON string representation of the object
print(StockData.to_json())

# convert the object into a dict
stock_data_dict = stock_data_instance.to_dict()
# create an instance of StockData from a dict
stock_data_from_dict = StockData.from_dict(stock_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


