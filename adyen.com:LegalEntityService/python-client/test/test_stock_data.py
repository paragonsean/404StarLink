# coding: utf-8

"""
    Legal Entity Management API

    The Legal Entity Management API enables you to manage legal entities that contain information required for verification.  ## Authentication To connect to the Legal Entity Management API, you must use the basic authentication credentials of your web service user. If you don't have one, contact the [Adyen Support Team](https://www.adyen.help/hc/en-us/requests/new). Use the web service user credentials to authenticate your request, for example:  ``` curl -U \"ws_123456@Scope.BalancePlatform_YourBalancePlatform\":\"YourWsPassword\" \\ -H \"Content-Type: application/json\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Legal Entity Management API supports versioning of its endpoints through a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://kyc-test.adyen.com/lem/v3/legalEntities ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the username and password to send requests to `https://kyc-live.adyen.com/lem/v3`.  

    The version of the OpenAPI document: 3
    Contact: developer-experience@adyen.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.stock_data import StockData

class TestStockData(unittest.TestCase):
    """StockData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> StockData:
        """Test StockData
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StockData`
        """
        model = StockData()
        if include_optional:
            return StockData(
                market_identifier = '',
                stock_number = '',
                ticker_symbol = ''
            )
        else:
            return StockData(
        )
        """

    def testStockData(self):
        """Test StockData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
