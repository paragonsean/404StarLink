# coding: utf-8

"""
    Soccer v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.lineup import Lineup

class TestLineup(unittest.TestCase):
    """Lineup unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Lineup:
        """Test Lineup
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Lineup`
        """
        model = Lineup()
        if include_optional:
            return Lineup(
                game_id = 56,
                game_minute = 56,
                game_minute_extra = 56,
                lineup_id = 56,
                name = '',
                pitch_position_horizontal = 56,
                pitch_position_vertical = 56,
                player_id = 56,
                position = '',
                replaced_player_id = 56,
                replaced_player_name = '',
                team_id = 56,
                type = ''
            )
        else:
            return Lineup(
        )
        """

    def testLineup(self):
        """Test Lineup"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
