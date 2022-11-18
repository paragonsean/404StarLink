# coding: utf-8

"""
    Ad Exchange Buyer API

    Accesses your bidding-account information, submits creatives for validation, finds available direct deals, and retrieves performance reports.

    The version of the OpenAPI document: v1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.marketplace_deal_party import MarketplaceDealParty

class TestMarketplaceDealParty(unittest.TestCase):
    """MarketplaceDealParty unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MarketplaceDealParty:
        """Test MarketplaceDealParty
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MarketplaceDealParty`
        """
        model = MarketplaceDealParty()
        if include_optional:
            return MarketplaceDealParty(
                buyer = openapi_client.models.buyer.Buyer(
                    account_id = '', ),
                seller = openapi_client.models.seller.Seller(
                    account_id = '', 
                    sub_account_id = '', )
            )
        else:
            return MarketplaceDealParty(
        )
        """

    def testMarketplaceDealParty(self):
        """Test MarketplaceDealParty"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
