# coding: utf-8

"""
    Soccer v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.penalty_shootout import PenaltyShootout

class TestPenaltyShootout(unittest.TestCase):
    """PenaltyShootout unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PenaltyShootout:
        """Test PenaltyShootout
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PenaltyShootout`
        """
        model = PenaltyShootout()
        if include_optional:
            return PenaltyShootout(
                game_id = 56,
                name = '',
                order = 56,
                penalty_shootout_id = 56,
                player_id = 56,
                position = '',
                team_id = 56,
                type = ''
            )
        else:
            return PenaltyShootout(
        )
        """

    def testPenaltyShootout(self):
        """Test PenaltyShootout"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
