# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class MxfProfile(str, Enum):
    """
    Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile based on the video codec and resolution. For a list of codecs supported with each MXF profile, see https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more information about the automatic selection behavior, see https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
    """

    """
    allowed enum values
    """
    D_10 = 'D_10'
    XDCAM = 'XDCAM'
    OP1A = 'OP1A'
    XAVC = 'XAVC'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of MxfProfile from a JSON string"""
        return cls(json.loads(json_str))


