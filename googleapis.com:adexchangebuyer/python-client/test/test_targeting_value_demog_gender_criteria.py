# coding: utf-8

"""
    Ad Exchange Buyer API

    Accesses your bidding-account information, submits creatives for validation, finds available direct deals, and retrieves performance reports.

    The version of the OpenAPI document: v1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.targeting_value_demog_gender_criteria import TargetingValueDemogGenderCriteria

class TestTargetingValueDemogGenderCriteria(unittest.TestCase):
    """TargetingValueDemogGenderCriteria unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> TargetingValueDemogGenderCriteria:
        """Test TargetingValueDemogGenderCriteria
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `TargetingValueDemogGenderCriteria`
        """
        model = TargetingValueDemogGenderCriteria()
        if include_optional:
            return TargetingValueDemogGenderCriteria(
                demog_gender_criteria_ids = [
                    ''
                    ]
            )
        else:
            return TargetingValueDemogGenderCriteria(
        )
        """

    def testTargetingValueDemogGenderCriteria(self):
        """Test TargetingValueDemogGenderCriteria"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
