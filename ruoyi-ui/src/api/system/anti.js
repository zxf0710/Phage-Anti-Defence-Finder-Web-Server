import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listAnti(query) {
  return request({
    url: '/system/anti/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getAnti(antiId) {
  return request({
    url: '/system/anti/' + antiId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addAnti(data) {
  return request({
    url: '/system/anti',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateAnti(data) {
  return request({
    url: '/system/anti',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delAnti(antiId) {
  return request({
    url: '/system/anti/' + antiId,
    method: 'delete'
  })
}


export function mhselectListAnti(condition) {
  return request({
    url: '/system/anti/mhselect/' + condition ,
    method: 'get',
  })
}
