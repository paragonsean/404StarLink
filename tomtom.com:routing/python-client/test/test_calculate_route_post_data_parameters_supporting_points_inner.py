# coding: utf-8

"""
    Routing

    Routing consists of the following service: <b>Calculate Route</b> Calculates a route between an origin and a destination, passing through waypoints (if specified). Additional routing parameters like traffic, avoidance conditions, departure/arrival time etc. can be taken into account. <b>Calculate Reachable Range</b> Calculates a set of locations that can be reached from the origin point, subject to the available fuel or energy budget that is specified in the request.

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.calculate_route_post_data_parameters_supporting_points_inner import CalculateRoutePostDataParametersSupportingPointsInner

class TestCalculateRoutePostDataParametersSupportingPointsInner(unittest.TestCase):
    """CalculateRoutePostDataParametersSupportingPointsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CalculateRoutePostDataParametersSupportingPointsInner:
        """Test CalculateRoutePostDataParametersSupportingPointsInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CalculateRoutePostDataParametersSupportingPointsInner`
        """
        model = CalculateRoutePostDataParametersSupportingPointsInner()
        if include_optional:
            return CalculateRoutePostDataParametersSupportingPointsInner(
                latitude = '',
                longitude = ''
            )
        else:
            return CalculateRoutePostDataParametersSupportingPointsInner(
        )
        """

    def testCalculateRoutePostDataParametersSupportingPointsInner(self):
        """Test CalculateRoutePostDataParametersSupportingPointsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
