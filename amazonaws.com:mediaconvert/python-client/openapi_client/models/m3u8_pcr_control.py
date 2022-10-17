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


class M3u8PcrControl(str, Enum):
    """
    When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    """

    """
    allowed enum values
    """
    PCR_EVERY_PES_PACKET = 'PCR_EVERY_PES_PACKET'
    CONFIGURED_PCR_PERIOD = 'CONFIGURED_PCR_PERIOD'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of M3u8PcrControl from a JSON string"""
        return cls(json.loads(json_str))


